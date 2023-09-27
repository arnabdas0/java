import java.util.*;
public class SetIteration {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Kolkata");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Gujrat");

        // Iterator it = cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        for(String city : cities){
            System.out.println(city);
        }
    }
}
