class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int a:asteroids){
            boolean  found=true;
            while(found && a<0 && !st.isEmpty() && st.peek()>0){
                int top=st.peek();
                if(top<-a){
                    st.pop();
                }else if(top==-a){
                    st.pop();
                    found=false;
                }else{
                    found=false;
                }
            }
            if(found){
                st.push(a);
            }
        }

        int res[]=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
}