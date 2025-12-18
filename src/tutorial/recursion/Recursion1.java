package tutorial.recursion;

public class Recursion1 {
    public static void message(){
        System.out.println("hello worlld");
        message1();
    }
    public static void message1(){
        System.out.println("hello worlld");
        message2();
    }
    public static void message2(){
        System.out.println("hello worlld");
        message3();
    }
    public static void message3(){
        System.out.println("hello worlld");

    }
    public static void main(String[] args) {
        message();
    }
}
