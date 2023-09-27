import java.util.*;

public class StackQ2 {
    public static String reversString(String str){
        Stack<Character> s = new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            result.append(s.pop());
        }

        return result.toString();
    }
    public static void main(String arngs[]){
        String str = "Hello World!";
        String result=reversString(str); 
        System.out.println(result);
    }
}
