public class Classroom {
    public static void main(String[] args) {
        int a = 7;
        int b = 16;
        int temp = Integer.MIN_VALUE;
        for(int i=a; i<=b; i++){
            for(int j=0; j<=Math.sqrt(b); j++){
                if(i==Math.pow(2, j)){
                    temp = Math.max(temp, i);
                }
            }
        }
        System.out.println(temp);
    }
}
