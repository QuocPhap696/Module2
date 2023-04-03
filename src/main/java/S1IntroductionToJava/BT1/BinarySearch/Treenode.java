package S1IntroductionToJava.BT1.BinarySearch;

public class Treenode<E> {
    protected E element;
    protected Treenode<E> left;
    protected Treenode<E> right;

    public Treenode(E e) {
        element = e;
    }
}
