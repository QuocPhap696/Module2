package S1IntroductionToJava.BT1.BinarySearch;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected Treenode<E> root;
    protected int size = 0;

    public BST() {

    }

    public BST(E[] object) {
        for (int i = 0; i < object.length; i++) {
            insert(object[i]);
        }
    }

    @Override
    public boolean insert(E e) {
        if (root == null)
            root = createNewNode(e);
        else {
            Treenode<E> parent = null;
            Treenode<E> curent = root;
            while (curent != null) {
                if (e.compareTo(curent.element) < 0) {
                    parent = curent;
                    curent = curent.left;
                } else if (e.compareTo(curent.element) > 0) {
                    parent = curent;
                    curent = curent.right;
                } else
                    return false;
            }
            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true;
    }
    protected Treenode<E> createNewNode(E e) {
        return new Treenode<>(e);
    }
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public  void inoder() {
        inoder(root);
    }

    protected void inoder(Treenode<E> root) {
        if (root == null) return;
        insert(root.left);
        System.out.println(root.element + " ");
        insert(root.right);

    }

    private void insert(Treenode<E> left) {

    }


}
