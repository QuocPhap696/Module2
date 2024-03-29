package S1IntroductionToJava.BT1.Queue;
import java.util.Queue;
public class MyLinkedListQueue {
    public Node head;
    public Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    //cd phương thức trong lớp MyLinkedListQueue
    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
    }

    //cd phương thức trong lớp MyLinkedListQueue
    public Node dequeue() {
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }

//    cd phương thức trong lớp MyLinkedListQueue
  public void equeue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
  }

      public static void main(String[] args) {
          MyLinkedListQueue queue = new MyLinkedListQueue();
          queue.enqueue(10);
          queue.enqueue(20);
          queue.dequeue();
          queue.dequeue();
          queue.enqueue(30);
          queue.enqueue(40);
          queue.enqueue(50);
          System.out.println("Dequeued item is " + queue.dequeue().key);

      }
  }

