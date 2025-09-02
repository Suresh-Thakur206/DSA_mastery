package tutorial;

import java.util.HashSet;
import java.util.Iterator;


public class HashSet1 {
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();

        // adding element
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // searching
        if(set.contains(1)){
            System.out.println("there is ");
        }
        if(!set.contains(6)){
            System.out.println("not there ");
        }

        // remove element
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("not present one ");
        }

        // size of set
        System.out.println("size of set is :"+set.size());

        // printing all element
        System.out.println(set);
    //Iterator
        Iterator it=set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}


