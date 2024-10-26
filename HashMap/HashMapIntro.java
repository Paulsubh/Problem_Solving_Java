package HashMap;
import java.util.*;

public class HashMapIntro {
    public static void main(String args[]){
        Map<String,Integer> map= new HashMap<>();
        map.put("Petrol",108);
        map.put("CNG",100);
        map.put("Diesel",80);
         System.out.println(map);

         //Search
        //  if(map.containsKey("Petrol")){
        //     System.out.println("Key is present!");
        //  }else{
        //     System.out.println("The key is not present!");
        //  }

        // System.out.println(map.get("Petrol"));

         //Iteration in HashMap
        for(Map.Entry<String,Integer> e: map.entrySet()){
                System.out.println(e+" ");
                System.out.println(e.getKey());
                System.out.println(e.getValue());
        }

        // To count the size of the HashMap
        System.out.println("The size of the map is: "+map.size());


        //To copy all mappings from the specified map to another map.
        Map<String,Integer> map1= new HashMap<>();
        map1.put("Srilanka",3);
        map1.put("China",2);
        map1.put("India",1);
        System.out.println("The first map is:"+map1);


        Map<String,Integer> map2= new HashMap<>();
        map2.put("Bangladesh",4);
        map2.put("Pakistan",5);
        map2.put("Afghanistan",6);
        map2.remove("Pakistan");
        System.out.println("The Second map is:"+map2);

        map2.putAll(map1);
        System.out.println("After copying first map to second map: "+map2);



    }
    
}
