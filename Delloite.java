import java.util.*;

public class Delloite {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map.put(arr[i][j], map.getOrDefault(arr[i][j], 0) + 1);
            }
        }
        int sum = 0;
        for (int key : map.keySet()) {
            if (map.get(key) % 2 == 0) {
                sum += (map.get(key) * key);
            }
        }
        System.out.println(sum);
    }
}