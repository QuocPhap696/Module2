package S1IntroductionToJava.BT1.BTthayQuang.TestLiked_List;

public class MyLinkedListTest  {
    public static void main(String[] args) {
        System.out.println("Testing");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4, 9);
        ll.add(4,9);
        ll.printList();

    }
}
