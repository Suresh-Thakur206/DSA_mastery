package tutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Studentsss {
int rollNo;
String name;
int marks;
public Studentsss(int rollNo, String name, int marks) {
    this.rollNo = rollNo;
    this.name = name;
    this.marks = marks;
}
}

public class LambdaComparator {
    public static void main(String[] args) {
        ArrayList<Studentsss> list=new ArrayList<>();
        list.add(new Studentsss(12,"mohan",55));
        list.add(new Studentsss(23,"ramu",65));
        list.add(new Studentsss(14,"ankita",45));
        list.add(new Studentsss(15,"sohan",85));
        list.add(new Studentsss(16,"monali",95));


//        Collections.sort(list,(s1,s2) ->{
//            return s2.marks-s1.marks;
//        });
        Collections.sort(list,(s1,s2) ->  s2.marks-s1.marks);
        //list.sort(new MyCustomComparator());
//        Collections.sort(list,new Comparator<Studentss>(){
//            @Override
//            public int compare(Studentss s1,Studentss s2){
////                if(s1.marks<s2.marks){
////                    return  1;
////                }else{
////                    return  -1;
////                }
//                if(s1.marks==s2.marks){
//                    return s1.rollNo-s2.rollNo;
//                }
//                return s2.marks-s1.marks;
//            }
//        });
        for(Studentsss s:list){
            System.out.println(s.rollNo+" "+s.name +" "+s.marks);
        }
    }
}



