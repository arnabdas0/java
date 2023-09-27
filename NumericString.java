import java.util.HashSet;

public class NumericString {
    public static void main(String[] args) {
        String n = "1210000004";
        HashSet<Character> s = new HashSet<>();
        for(int i=0; i<n.length(); i++){
            if(Character.isDigit(n.charAt(i))){
                s.add(n.charAt(i));
            }
        }
        System.out.println(s.size());
    }
}
