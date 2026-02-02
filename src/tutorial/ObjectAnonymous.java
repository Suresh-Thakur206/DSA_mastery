package tutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Studentss {
    int rollNo;
    String name;
    int marks;
    public Studentss(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}



public  class ObjectAnonymous {
    public static void main(String[] args) {
        ArrayList<Studentss> list=new ArrayList<>();
        list.add(new Studentss(12,"mohan",55));
        list.add(new Studentss(23,"ramu",65));
        list.add(new Studentss(14,"ankita",65));
        list.add(new Studentss(15,"sohan",85));
        list.add(new Studentss(16,"monali",85));
        //list.sort(new MyCustomComparator());
        Collections.sort(list,new Comparator<Studentss>(){
            @Override
            public int compare(Studentss s1,Studentss s2){
//                if(s1.marks<s2.marks){
//                    return  1;
//                }else{
//                    return  -1;
//                }
                if(s1.marks==s2.marks){
                    return s1.rollNo-s2.rollNo;
                }
                return s2.marks-s1.marks;
            }
        });
        for(Studentss s:list){
            System.out.println(s.rollNo+" "+s.name +" "+s.marks);
        }
    }
}

