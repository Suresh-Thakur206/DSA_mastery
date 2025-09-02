package Array.medium;
import java.util.Scanner;


public class Matrix1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row:");
        int row=sc.nextInt();
        System.out.println("Enter column");
        int col=sc.nextInt();
        int [][]arr=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++){
                System.out.println("Enter element at "+i+""+j+"index");
                arr[i][j]=sc.nextInt();
            }
            System.out.print("\n");
        }

        // printing element of matrix
        System.out.println("Element of matrix are: ");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
