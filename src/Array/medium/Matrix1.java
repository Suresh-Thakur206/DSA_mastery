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
        System.out.println("Element of matrix before manupulate are: ");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++){

                    System.out.print(arr[i][j]+"\t");
            }
            System.out.print("\n");
        }

        // Test case

        boolean isTrue=false;
 
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==0){
                    for(int l=0;l<col;l++){
                        arr[i][l]=0;
                    }
                    for(int k=0;k<row;k++){
                        arr[k][j]=0;
                    }
                    isTrue=true;
                    break;
                }

            }
            if(isTrue){
                break;
            }
        }

        // after manupulation


        System.out.println("Element of matrix after manupulate are: ");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++){

                System.out.print(arr[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
