package tutorial;

import java.util.ArrayList;

import java.util.Collections;

class Student implements Comparable<Student>{
    int rollNo;
    String name;
    int marks;
    public Student(int rollNo,String name,int marks){
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }

    @Override
    public int compareTo(Student that){
        if(this.rollNo<that.rollNo){
            return -1;
        }else{
            return 1;
        }
    }
}
public class ObjectComparable {
    public static void main(String args[]){
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student(12,"mohan",55));
        list.add(new Student(23,"ramu",65));
        list.add(new Student(14,"ankita",75));
        list.add(new Student(15,"sohan",85));
        list.add(new Student(16,"monali",95));
        Collections.sort(list);
        for(Student s:list){
            System.out.println(s.rollNo+" "+s.name +" "+s.marks);
        }

    }

}
