class Solution {
    public int[][] kClosest(int[][] points, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<int[]> result=new ArrayList<>();

        for(int i=0;i<points.length;i++){

            int rootVal = points[i][0]*points[i][0] + points[i][1]*points[i][1];
            list.add(rootVal);

        }

        while(k!=0){
            int min=Integer.MAX_VALUE;
            int minIndexVal=-1;
            for(int i=0;i<list.size();i++){
                if(list.get(i)<min){
                    min=list.get(i);
                    minIndexVal=i;
                }
            }
            result.add(points[minIndexVal]);
            list.set(minIndexVal, Integer.MAX_VALUE);

            k--;
        }
        int[][]resultInArr=new int[result.size()][2];
        for(int i=0;i<result.size();i++){
            resultInArr[i]=result.get(i);
        }
        return resultInArr;

    }
}