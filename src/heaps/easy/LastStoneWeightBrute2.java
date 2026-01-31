class Solution {
    public void sorts(List<Integer> list){
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(j)<list.get(i)){
                    int temp=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }
    public void insertSort(ArrayList<Integer> list,int value){
        int i=0;
        while(i<list.size() && list.get(i)<value){
            i++;
        }
        list.add(i,value);
    }
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer>list=new ArrayList<>();
        if(stones.length==1){
            return stones[0];
        }
        if(stones.length==0){
            return 0;
        }
        for(int stone:stones){
            list.add(stone);
        }

        sorts(list);
        while(list.size()>=2){
            int x=list.get(list.size()-2);
            int y=list.get(list.size()-1);
            int n=list.size();
            list.remove(list.size()-2);
            list.remove(list.size()-1);
            if(x!=y){
                insertSort(list,(y-x));
            }
        }


        return list.isEmpty() ? 0 : list.get(0);
    }
}