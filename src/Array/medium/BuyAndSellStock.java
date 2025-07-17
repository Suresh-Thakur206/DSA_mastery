package Array.medium;

import java.util.Scanner;

public class BuyAndSellStock {
    public static int buySell(int prices[]){
        int n=prices.length;
        int min=prices[0];
        int position=0;
        for(int i=1;i<n;i++){
            if(prices[i]<min){
                for(int j=i+1;j<n;j++){
                    if(prices[j]>prices[i]){


                        min=prices[i];
                        position=i;

                    }
                }

            }

        }


        int max=prices[position];
        int maxPos=0;
        for(int i=position+1;i<n;i++){
            if(prices[i]>max){
                max=prices[i];
                maxPos=i;
            }
        }

       if(position<maxPos){
           int profit=max-min;
           return profit;

       }
       return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int prices[]=new int[size];
        for(int i=0;i<prices.length;i++){
            prices[i]=sc.nextInt();
        }
        System.out.println(buySell(prices));

    }
}
