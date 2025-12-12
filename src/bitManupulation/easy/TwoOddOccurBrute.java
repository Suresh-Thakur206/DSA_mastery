class Solution {
    ArrayList<Integer> twoOddNum(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for( Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()%2==1){
                int arrValue=entry.getKey();
                min=Math.min(min,arrValue);
                max=Math.max(max,arrValue);
            }
        }

        list.add(max);
        list.add(min);
        return list;
    }
}
