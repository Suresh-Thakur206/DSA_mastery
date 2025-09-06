package tutorial;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps {
    public static void main(String[] args) {
       HashMap<String,Integer> map=new HashMap<>();
        map.put("nepal",120);
        map.put("india",500);
        map.put("srilanka",100);
        map.put("china",400);
        System.out.println(map);
        map.put("china",800);
        System.out.println(map);
        if(map.containsKey("america")){
            System.out.println("yes it is present");
        }else{
            System.out.println("it is not present ");
        }
        if(map.containsKey("china")){
            System.out.println("yes it is present");
        }else{
            System.out.println("it is not present ");
        }
        System.out.println(map.get("china"));
        System.out.println(map.get("inodnesia"));

        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.print(e.getValue()+",");
        }
        System.out.println(" ");
        Set<String> keys=map.keySet();
        for (String key : keys) {
            System.out.println(key+" ");
        }
        map.remove("china");
        System.out.println(map);
    }
}
