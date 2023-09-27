import java.util.LinkedList;
public class LLJcf {
    public static void main(String arng[]){
        //create
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addFirst(0);
        ll.addFirst(1);
        ll.addLast(2);
        System.out.println(ll);

        //remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
