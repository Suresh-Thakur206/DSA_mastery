package tutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students {
    int rollNo;
    String name;
    int marks;

    public Students(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

class MyCustomComparator implements Comparator<Students>{
    @Override
    public int compare(Students s1,Students s2){
        if(s1.marks<s2.marks){
            return  1;
        }else{
            return  -1;
        }
    }
}

public  class ObjectComparator {
    public static void main(String[] args) {
        ArrayList<Students> list=new ArrayList<>();
        list.add(new Students(12,"mohan",55));
        list.add(new Students(23,"ramu",65));
        list.add(new Students(14,"ankita",75));
        list.add(new Students(15,"sohan",85));
        list.add(new Students(16,"monali",95));
        list.sort(new MyCustomComparator());
        //Collections.sort(list,new MyCustomComparator());
        for(Students s:list){
            System.out.println(s.rollNo+" "+s.name +" "+s.marks);
        }
    }
}

