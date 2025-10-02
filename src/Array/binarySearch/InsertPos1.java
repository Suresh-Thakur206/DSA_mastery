package Array.binarySearch;

import java.util.Scanner;

public class InsertPos1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int []arr=new int[size];
        //taking array element
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
    }

}
