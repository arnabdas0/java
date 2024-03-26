import java.util.*;

public class Capgemini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dealership = sc.nextInt();
        while (dealership-- > 0) {
            int cars = sc.nextInt();
            int bikes = sc.nextInt();
            System.out.println(cars * 4 + bikes * 2);
        }
        sc.close();
    }
}