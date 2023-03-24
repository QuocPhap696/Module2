package S1IntroductionToJava.BT1.BTthayQuang.TestLiked_List;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList (Object data){
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
    // cài đặt phương thức add
    public void add (int index, Object data) {
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
    // cài đặt phương thức addFirst
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    // cài đặt phương thức get (lấy phần tử ở vị trí index từ danh sách)
    public Node get (int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return  temp;
    }
    // cài đặt phương thức printList (hiển thị phần tử trong danh sách)
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
