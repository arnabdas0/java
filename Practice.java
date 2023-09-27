import java.util.*;
public class Practice {
    public static void vowelCount(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        String str1="Heart";
        String str2="Earth";
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length()){
            char[] str1CharArray=str1.toCharArray();
            char[] str2CharArray=str2.toCharArray();
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);
            boolean result=Arrays.equals(str1CharArray, str2CharArray);
            if(result){
                System.out.println(str1 + " and "+ str2 +" are anagrams of each other.");
            }else{
                System.out.println(str1 + " and "+ str2 +" are not anagrams of each other.");
            }
        }else{
            System.out.println(str1 + " and "+ str2 +" are not anagrams of each other.");
        }
    }
}
