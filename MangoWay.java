public class MangoWay {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }

        return (n*fact(n-1));
    }
    public static void main(String[] args) {
        int n = 3;
        int r = 2;

        int ways = (fact(n+r-1)/(fact(r-1)*fact(n)));

        System.out.println(ways);
    }
}
