import java.util.Scanner;

public class Array2 {
    public static int[] fun(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+2;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array :");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] k=fun(arr);
        System.out.println("result is : ");
        for(int i=0;i<k.length;i++){
            System.out.println(k[i]);
        }
    }
}
