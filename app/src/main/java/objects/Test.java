package objects;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("Student1", 2);
        m.put("Student2", 3);
        m.put("Student3", 4);

//        using for each loop
//        System.out.println("Iterating using for each loop");
//        Set<Map.Entry<String, Integer>> s = m.entrySet();
//        for (Map.Entry<String, Integer> e : s)
//            System.out.println(e.getKey() +"---"+ e.getValue());

//        using iterator
//        System.out.println("Iterating using iterator");
//        Set<Map.Entry<String, Integer>> s = m.entrySet();
//        Iterator<Map.Entry<String, Integer>> itr = s.iterator();
//        while (itr.hasNext()) {
//            Map.Entry<String, Integer> e = itr.next();
//            System.out.println(e.getKey() +"----"+ e.getValue());
//        }

//        using forEach
//        System.out.println("Iterating using forEach");
//        m.forEach((k, v) -> System.out.println(k +"----"+ v));
    }
}
