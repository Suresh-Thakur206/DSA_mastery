class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int a:asteroids){
            list.add(a);
        }
        int i=0;
        while(i<list.size()-1){
            int left=list.get(i);
            int right=list.get(i+1);
            if(left>0 && right<0){
                if(Math.abs(left)==Math.abs(right)){
                    list.remove(i+1);
                    list.remove(i);

                    i=Math.max(i-1,0);
                }else if(Math.abs(left)>Math.abs(right)){
                    list.remove(i+1);
                }else{
                    list.remove(i);
                    i=Math.max(i-1,0);
                }
            }else{
                i++;
            }
        }
        int result[]=new int[list.size()];
        for(int j=0;j<list.size();j++){
            result[j]=list.get(j);
        }
        return result;
    }
}