import java.util.*;

public class LonelyNo {
    public static ArrayList<Integer> isLonely(ArrayList<Integer> nums){
        Collections.sort(nums);
        ArrayList<Integer> lonely = new ArrayList<>();
        for (int i=1; i<nums.size()-1; i++){
            if(nums.get(i-1)+1<nums.get(i) && nums.get(i)+1<nums.get(i+1)){
                lonely.add(nums.get(i));
            }
        }
        if (nums.size()==1){
            lonely.add(nums.get(0));
        }
        if (nums.size()>1){
            if(nums.get(0)+1<nums.get(1)){
                lonely.add(nums.get(0));
            }
            if(nums.get(nums.size()-2)+1<nums.get(nums.size()-1)){
                lonely.add(nums.get(nums.size()-1));
            }
        }
        return lonely;
    }
    public static void main(String args[]){
        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);

        System.out.println(isLonely(nums));
    }
}
