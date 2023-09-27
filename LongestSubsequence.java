import java.util.*;
public class LongestSubsequence {
    public static int lis(int arr[]){
        ArrayList<Integer> list = new ArrayList<>();
        int smallest = smallIdx(arr);
        list.add(smallest);
        int n = list.size();
        for(int i=1; i<arr.length; i++){
            if(arr[i]>list.get(n-1)){
                list.add(arr[i]);
            }else{
                i++;
            }
        }
        printArr(list);
        return list.size();
    }

    public static void printArr(ArrayList<Integer> list){
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
    }

    public static int smallIdx(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        // System.out.println(smallest);
        return smallest;
    }

    public static void main(String[] args) {
        int arr[] = {50, 80, 10, 7, 40, 3};
        System.out.println(lis(arr));
    }
}
// not correct