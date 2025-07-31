package tutorial;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        //add element to arraay list
        list.add(0);
        list.add(1);
        list.add(3);
        //print the arraylist
        System.out.print(list);
        System.out.println("");
        //getting the element stored using index
        int element=list.get(0);
        System.out.println(element);
        //add element in middle
        list.add(2,2);
        System.out.print(list);
        // set the element
        list.set(0,5);
        System.out.println("");
        System.out.println(list);
        // delet element
        list.remove(3);
        System.out.println(list);
        //size of array
        System.out.println(list.size());
        // printing usng loop
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
            System.out.println();
        }

        //sorting element
        Collections.sort(list);
        System.out.println(list);

    }
}
