package S1IntroductionToJava.BT1.BTthayQuang.TrienKhaiLinkedList;

public class MyLinkdedList {
    private Node head;
    private int numOfNodes;

    public MyLinkdedList(Node head) {
        this.head = head;
    }

    public void addFirts(Object data){
        Node temp = head; // tạo ra temp và trỏ tới head
        head = new Node(data);
        head.next = temp;
        numOfNodes++;
    }
    public void addByIndex(int index, Object data) {
        Node temp = head;
        for (int i = 0; i < index -1 && temp.next != null; i++) {
            temp = temp.next;
        }
        Node holder = temp.next;
        temp.next = new Node(data);
        numOfNodes++; //tăng size
    }

    public void deleteByIndex(int index) {
        Node temp = head;
        for (int i = 0; i < index -1 && temp.next != null ; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numOfNodes--;
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



}
