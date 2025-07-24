package tutorial;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MismatchHashMap {
    public static int[] show(int nums[]){
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=n;i++){
            map.put(i,0);
        }

        for (int num : nums) {
            map.put(num,map.get(num)+1);
        }

        int duplicate=0;
        int missing=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            if(value==2){
                duplicate=key;
            }
            if(value==0){
                missing=key;
            }
        }
        return new int[]{duplicate,missing};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int nums[]=new int[size];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<show(nums).length;i++){
            System.out.print(i+" ");
        }
    }
}
