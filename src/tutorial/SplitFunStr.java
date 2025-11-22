package tutorial;

public class SplitFunStr {
    public static void main(String[] args) {
        String str1="This is hello world";
        String str2[]=str1.split("\\s");
//        for(String st:str2){
//            System.out.println(st);
//        }
        System.out.println(str2[0]);
    }
}
