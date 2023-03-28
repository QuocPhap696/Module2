package S1IntroductionToJava.BT1.TrienKhaiStack;

public class MyStack {
    private int [] arr;
    private int size;
    private int index = 0;

    public MyStack(int size) {
    }

    public void MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }
    //cd pthuc push()
    public void push(int element){
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }
    //cd phương thức pop()
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }
    //cd phương thức size
    public int size() {
        return index;
    }
    //cd phương thức isEmpty
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        } return false;
    }
    //cd phương thức isFull
    public boolean isFull() {
        if (index == size ) {
            return true;
        } return false;
    }
    //cd lớp StackClient chứa phương thức main
    public static void main(String[] args) throws Exception {
        MyStack MyStack = new MyStack(5);

        MyStack.push(5);
        MyStack.push(4);
        MyStack.push(3);
        MyStack.push(4);
        MyStack.push(2);
        MyStack.push(1);
        System.out.println(MyStack.size());
        System.out.println("2. Pop elements from stack");

        while (!MyStack.isEmpty()) {
            System.out.printf("%d", MyStack.pop());
        }
        System.out.println("\n3. Size of stack pop operations " + MyStack.size());
    }
}