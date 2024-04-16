import java.util.HashMap;
import java.util.TreeMap;

public class Map {

    public static void main(String[] args) {

        HashMap<String, Integer> names = new HashMap<String, Integer>();

        names.put("Hussin", 1);
        names.put("Ali", 2222);
        names.put("koko", 11);
        System.out.println(names);
/*       System.out.println(names.get("Hussin"));
       System.out.println(names.containsKey("Ali"));
      System.out.println(names.containsValue(000001));
    names.put("koko", 122332);
       System.out.println(names);
      names.replace("koko", 90000);
      System.out.println(names);*/
    }
}

//Welche Map Implementierungen gibt es in Java, nenne die zwei bekanntesten? TreeMap und Hashmap 