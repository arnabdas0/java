import java.util.*;
public class MyClass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        int n = str.length();
        double root = Math.sqrt(n);
        double r = Math.floor(root);
        double c = Math.ceil(root);

        if(r*c < n){
            r++;
        }

        char arr[][] = new char[(int)r][(int)c];
        char word[] = str.toCharArray();
        int k=0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(k<n){
                    arr[i][j] = word[k++];
                }else{
                    arr[i][j] = ' ';
                }
            }
        }

        for(int j=0; j<c; j++){
            for(int i=0; i<r; i++){
                System.out.print(arr[i][j]);
                if(i==(r-1)){
                    System.out.print(" ");
                }
            }
        }
    }
}
