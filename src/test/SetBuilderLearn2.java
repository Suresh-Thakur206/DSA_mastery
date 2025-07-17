package test;

import java.util.Scanner;

public class SetBuilderLearn2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        sc.nextLine();
        char[]ch=new char[n];
        for(int i=0;i<ch.length;i++){
           String input=sc.nextLine();
            ch[i]=input.charAt(0);

        }
        StringBuilder sb=new StringBuilder();
        for (char c : ch) {
            sb.append(c);
        }
        String result=sb.toString();
        System.out.println("combined string "+result);
    }
}
