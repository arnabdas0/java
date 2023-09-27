public class BinaryToDecimal {
    public static void binToDec(int binNum){
        int pow = 0;
        int dec = 0;
        while(binNum>0){
            int lastDigit = binNum % 10;
            dec += (lastDigit*(int)Math.pow(2, pow));
            pow++;
            binNum /=10;
        }
        System.out.println(dec);
    }
    public static void decToBin(int n){
        int pow = 0;
        int bin = 0;
        while(n>0){
            int rem = n % 2;
            bin += (rem*(int)Math.pow(10, pow));
            pow++;
            n /=2;
        }
        System.out.println(bin);
    }
    public static void main(String[] args) {
        int binNum = 10;
        int decNum = 5;
        binToDec(binNum);
        decToBin(decNum);
    }
}
