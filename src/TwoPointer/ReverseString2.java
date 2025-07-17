package TwoPointer;

public class ReverseString2 {
    public static void main(String[] args) {
        String name="Good";
        char []ch=name.toCharArray();
        int n=ch.length;
        System.out.println(n);
        System.out.print("[");
        for (char c : ch) {
            System.out.print("\""+c+"\"");
            if(c!=ch.length-2){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
