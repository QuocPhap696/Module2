package S1IntroductionToJava.BT1.BinarySearch;

public class TestBST {
    public static void main(String[] args) {
        //create a BST
        BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Micheal");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

        System.out.println("Inoder (sorted) :");
        tree.inoder();
        System.out.println("The number of nodes is :" + tree.getSize());
    }
}
