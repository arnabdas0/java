import java.util.*;
public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(arr[i][j]);
                if(j!=(n-1)){
                    System.out.print(" ");
                }
            }

            for(int j=i+1; j<n; j++){
                System.out.print(0);
                if(j!=(n-1)){
                    System.out.print(" ");
                }
            }
            if(i!=(n-1)){
                System.out.println();
            }
        }
    }
}
