package S1IntroductionToJava.BT1.arraylistAndLinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLinkedList {
    public static void main(String[] args) {
        //tạo arraylist
        List<String> arraylist = new ArrayList<String>();
        arraylist.add("Một");
        arraylist.add("Hai");
        arraylist.add("Ba");
        arraylist.add("Bốn");


        //tạo linkedList
        List<String> linkedlist = new LinkedList<String>();
        linkedlist.add("1");
        linkedlist.add("2");
        linkedlist.add("3");
        linkedlist.add("4");

        System.out.println("ArrayList" + arraylist);
        System.out.println("LinkedList"+ linkedlist);
    }
}
