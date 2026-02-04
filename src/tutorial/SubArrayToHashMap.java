package tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubArrayToHashMap {
    public static void main(String[] args) {
        int [][]arr={{1,2,8},{2,4},{5,6},{6,8}};
        HashMap<Integer, ArrayList<int[]>> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key=i;
//            if(!map.containsKey(key)){
//                map.put(i,new ArrayList<>());
//            }
            map.putIfAbsent(i,new ArrayList<>());
            map.get(key).add(arr[i]);
        }

        for(Map.Entry<Integer,ArrayList<int[]>> entry:map.entrySet()){
            System.out.println("key"+entry.getKey()+" -> ");
            for(int[] array:entry.getValue()){
                System.out.print(Arrays.toString(array)+" ");
            }
            System.out.println();
        }
    }
}
