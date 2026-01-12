class Solution {
    // funciton for finding next smaller element 
    public int[] findNSE(int[] nums){
        int n=nums.length;
        int []ans=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && nums[stack.peek()]>=nums[i]){
                stack.pop();
            }
            ans[i]=!stack.isEmpty()?stack.peek():n;
            stack.push(i);


        }
        return ans;
    }

    // funciton for finding next greater element 
    public int[] findNGE(int[] nums){
        int n=nums.length;
        int []ans=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && nums[stack.peek()]<=nums[i]){
                stack.pop();
            }
            ans[i]=!stack.isEmpty()?stack.peek():n;
            stack.push(i);

        }
        return ans;
    }
    // Function to find indices of Previous Smaller or Equal Elements
    public int[] findPSEE(int[] nums){
        int n=nums.length;
        int []ans=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && nums[stack.peek()]>nums[i]){
                stack.pop();
            }
            ans[i]=!stack.isEmpty()?stack.peek():-1;
            stack.push(i);

        }
        return ans;
    }

    // Function to find indices of Previous Greater or Equal Elements

    public int[] findPGEE(int[] nums){
        int n=nums.length;
        int []ans=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i]){
                stack.pop();
            }
            ans[i]=!stack.isEmpty()?stack.peek():-1;
            stack.push(i);

        }
        return ans;
    }
    // Function to compute sum of subarray minimums
    public long sumSubArrayMin(int []nums){
        int n=nums.length;
        int []nse=findNSE(nums);
        int []psee=findPSEE(nums);
        long sum=0;
        for(int i=0;i<n;i++){
            int left=i-psee[i];
            int right=nse[i]-i;
            long freq=1L*left*right;
            sum+=(freq*nums[i]);
        }
        return sum;
    }
    // funciton to compute sum of subarray maximums
    public long sumSubArrayMax(int []nums){
        int n=nums.length;
        int []nge=findNGE(nums);
        int []pgee=findPGEE(nums);
        long sum=0;
        for(int i=0;i<n;i++){
            int left=i-pgee[i];
            int right=nge[i]-i;
            long freq=1L*left*right;
            sum+=(freq*nums[i]);
        }
        return sum;
    }

    public long subArrayRanges(int[] nums) {
        return sumSubArrayMax(nums)-sumSubArrayMin(nums);
    }
}