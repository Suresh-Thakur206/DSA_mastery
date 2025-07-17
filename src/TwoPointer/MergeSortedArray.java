package TwoPointer;

import java.util.Scanner;

public class MergeSortedArray {
    public static void show(int []num1,int m,int[]num2,int n){
        for(int i=0;i<n;i++){
            num1[m+i]+=num2[i];
        }
        System.out.println("array after merge is : ");
        for (int i : num1) {
            System.out.print(i+" ");
        }
        int k=num1.length;
        for(int i=0;i<k;i++){
            for(int j=i;j<k;j++){
                if(num1[i]>num1[j]){
                    int temp=num1[i];
                    num1[i]=num1[j];
                    num1[j]=temp;

                }
            }

        }
        System.out.println("Array after sorted");
        for (int i : num1) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("what is number of element in first array: ");
        int m=sc.nextInt();
        System.out.println("What is the number of element in second array ");
        int n=sc.nextInt();
        int []num1=new int[m+n];
        int []num2=new int[n];
        System.out.println("Enter the element in first array: ");
        for(int i=0;i<m;i++){
            num1[i]=sc.nextInt();

        }
        System.out.println("Enter the element in second array: ");
        for(int i=0;i<n;i++){
            num2[i]=sc.nextInt();
        }


        show(num1,m,num2,n);

    }
}
