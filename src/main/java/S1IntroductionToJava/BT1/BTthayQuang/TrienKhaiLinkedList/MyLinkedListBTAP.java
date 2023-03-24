package S1IntroductionToJava.BT1.BTthayQuang.TrienKhaiLinkedList;

public class MyLinkedListBTAP {
    private Node head;
    private int numNodes;

    public MyLinkedListBTAP(Object data) {
        head = new Node(data);
        numNodes++;
    }

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    //thêm phương thức add (thêm đối tượng vào vị trí index)
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    //thêm phương thức addFirst()
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    //thêm phương thức get()
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // cài đặt phương thức printList
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    // tạo lớp TestMyLinkedList chứa hàm main
    // tạo đối tượng  thuộc lớp MyLinkedList
    // gọi phương thức addFirts(), add(), printList()
    public class TestMyLinkedList {
        public static void main(String [] args) {
            System.out.println("/=/=/=/= TESTING /=/=/=/=");
            MyLinkedListBTAP ll = new MyLinkedListBTAP(10);
            ll.addFirst(11);
            ll.addFirst(12);
            ll.addFirst(13);

            ll.add(4,9);
            ll.add(4,9);
            ll.printList();
        }
    }
}
