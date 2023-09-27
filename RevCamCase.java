import java.util.*;
public class RevCamCase {
    public static String[] revCamCase(String str){
        String newString = "";
        char c[] = str.toCharArray();
        for (char d : c) {
            if(Character.isUpperCase(d)){
                newString += (" " + d).toLowerCase();
            }else{
                newString += Character.toUpperCase(d);
            }
        }

        String output[] = newString.split(" ");

        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String output[] = revCamCase(str);

        for (String string : output) {
            System.out.println(string);
        }
        sc.close();
    }
}
