
//Fractional Knapsack (GFG)

// custom class for tracking value , wight, and ratio of each class
class Item{
    int value;
    int weight;
    double ratio;

    Item(int value,int weight){
        this.value=value;
        this.weight=weight;
        this.ratio=(double)value/weight;
    }
}





class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        double totalValue=0.0;

        // Array of object
        Item[] items=new Item[val.length];

        // sotre object into item array
        for(int i=0;i<val.length;i++){
            items[i]=new Item(val[i],wt[i]);
        }

        // sorting object of items using comparator
        Arrays.sort(items,new Comparator<Item>(){
            @Override
            public int compare(Item a, Item b){
                return Double.compare(b.ratio,a.ratio);

            }
        });

        // calculate total value
        for(int i=0;i<val.length;i++){
            if(items[i].weight<=capacity){
                totalValue+=items[i].value;
                capacity-=items[i].weight;

            }else{
                totalValue=totalValue+items[i].ratio*capacity;
                capacity=0;
                break;
            }
        }
        return totalValue;
    }
}