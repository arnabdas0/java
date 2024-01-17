import java.util.Scanner;

public class civilwar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] powers = new int[N];

        for (int i = 0; i < N; i++) {
            powers[i] = scanner.nextInt();
        }

        long teamIronManPower = 0;
        long teamCaptainAmericaPower = 0;

        int left = 0;  // Left pointer
        int right = N - 1; // Right pointer
        boolean ironManTurn = true;

        while (left <= right) {
            if (ironManTurn) {
                // Iron Man's turn
                if (powers[left] >= powers[right]) {
                    teamIronManPower += powers[left];
                    left++;
                } else {
                    teamIronManPower += powers[right];
                    right--;
                }
            } else {
                // Captain America's turn
                if (powers[left] >= powers[right]) {
                    teamCaptainAmericaPower += powers[left];
                    left++;
                } else {
                    teamCaptainAmericaPower += powers[right];
                    right--;
                }
            }

            ironManTurn = !ironManTurn;
        }

        long powerDifference = teamIronManPower - teamCaptainAmericaPower;
        System.out.println(powerDifference);

        scanner.close();
    }
}
