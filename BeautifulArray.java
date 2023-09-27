import java.util.*;

public class BeautifulArray {
    public static ArrayList<Integer> isBeautiful(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        divideConqure(1,1,res,n);
        return res;
    }

    public static void divideConqure(int start, int increament, ArrayList<Integer> res, int n) {
        if(start+increament>n){
            res.add(start);
            return;
        }
        divideConqure(start, 2*increament, res, n);
        divideConqure(start+increament, 2*increament, res, n);
    }
    public static void main(String args[]){
        int n= 4;
        System.out.println(isBeautiful(n));

    }
}
