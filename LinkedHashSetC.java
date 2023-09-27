import java.util.*;
public class LinkedHashSetC {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Kolkata");
        set.add("Mumbai");
        set.add("Delhi");
        set.add("Gujrat");
        System.out.println(set);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Kolkata");
        lhs.add("Mumbai");
        lhs.add("Delhi");
        lhs.add("Gujrat");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Kolkata");
        ts.add("Mumbai");
        ts.add("Delhi");
        ts.add("Gujrat");
        System.out.println(ts);
    }
}
