import java.util.*;
public class HashMapC {
    public static void main(String[] args) {
        //create
        HashMap<String, Integer> hm = new HashMap<>();

        //insert - O(1)
        hm.put("India", 100);
        hm.put("China", 120);
        hm.put("US", 50);

        System.out.println(hm);

        //get - O(1)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia"));

        //containsKey - O(1)
        System.out.println(hm.containsKey("India"));//true
        System.out.println(hm.containsKey("Indonesia"));//false

        //remove - O(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
    }
}
