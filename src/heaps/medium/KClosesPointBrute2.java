class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();

        ArrayList<int[]> result=new ArrayList<>();
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<points.length;i++){

            int rootVal = points[i][0]*points[i][0] + points[i][1]*points[i][1];

            queue.offer(rootVal);
            map.put(i,rootVal);

        }
        while(k!=0){


            int value=queue.poll();
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                if(entry.getValue()==value){
                    result.add(points[entry.getKey()]);
                    map.put(entry.getKey(),Integer.MAX_VALUE);
                    break;
                }
            }

            k--;
        }
        int[][]resultInArr=new int[result.size()][2];
        for(int i=0;i<result.size();i++){
            resultInArr[i]=result.get(i);
        }
        return resultInArr;

    }
}