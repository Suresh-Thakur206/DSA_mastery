package Array;

import java.util.Scanner;

public class Array1 {
    public static int[] fun(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of arrY:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] result=fun();
        System.out.println("reusult is ");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
