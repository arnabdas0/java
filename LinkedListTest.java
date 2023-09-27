public class LinkedListTest{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //step1 = create new node
        Node newNode = new Node(data);
        size++;

        if(head==null){
            head = tail = newNode;
            return;
        }

        //step2 new node next = head
        newNode.next = head;//link

        //step3 head = new node
        head = newNode;
    }

    public void addLast(int data){
        //step1 = create new node
        Node newNode = new Node(data);
        size++;

        if(head==null){
            head = tail = newNode;
            return;
        }

        //step2 tail next = null
        tail.next = newNode;//link

        //step3 tail = new node
        tail = newNode;
    }

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        
        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;//tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key){//O(n)
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    public int helper(Node head, int key){//O(n)
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){
        return helper(head, key);
    }

    public void reverse(){//O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthFromEnd(int n){
        //calculatin size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        //corner case
        if(n == sz){
            head = head.next;//removeFirst
            return;
        }

        //sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while (i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    //Slow-Fast Approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;//+1
            fast = fast.next.next;//+2
        }

        return slow;//slow is my midNode
    }

    public boolean chkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        //step-1 find midNode
        Node midNode = findMid(head);

        //step-2 2nd Half Reverse
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //Check if left == right half
        Node left = head;
        Node right = prev;
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static boolean isCycle(){//Floyd's CFA
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;//+1
            fast = fast.next.next;//+2
            if(slow == fast){
                return true;//Cycle exists
            }
        }

        return false;//Cycle doesn't exists
    }

    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }

        if(cycle == false){
            return;
        }

        //find meeting point
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;//last node
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle last node->null
        prev.next = null;
    }

    public void print(){//O(n)
        if(head==null){
            System.out.println("Linked list is EMPTY");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        // LinkedList ll = new LinkedList();
        // ll.addFirst(1);       
        // ll.addFirst(2);
        // ll.addLast(1);         
        // ll.addLast(2);
        // ll.add(2, 1);
        // ll.print();
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);
        
        // System.out.println(ll.recSearch(3));

        // ll.reverse();
        // ll.print();
        // ll.deleteNthFromEnd(3);
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.addLast(1);
        // ll.print();
        // System.out.println(ll.chkPalindrome());

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // head.next.next.next = head;

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}