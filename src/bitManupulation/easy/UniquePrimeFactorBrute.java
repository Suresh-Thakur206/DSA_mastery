class Solution {
    public static ArrayList<Integer> primeFac(int n) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                set.add(i);
                n=n/i;
            }
        }
        if(n>1){
            set.add(n);
        }
        for(int value:set){
            list.add(value);
        }
        return list;
    }
}