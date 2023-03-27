//package S1IntroductionToJava.BT1.TrienKhaiStack;
//
//public class stack {
//    private int [] arr;
//    private int size;
//    private int index = 0;
//
//    public void MyStack(int size) {
//        this.size = size;
//        arr = new int[size];
//    }
//    //cd pthuc push()
//    public void push(int element){
//        if (isFull()) {
//            throw new StackOverflowError("Stack is full");
//        }
//        arr[index] = element;
//        index++;
//    }
//    //cd phương thức pop()
//    public int pop() throws Exception {
//        if (isEmpty()) {
//            throw new Exception("Stack is null");
//        }
//        return arr[--index];
//    }
//    //cd phương thức size
//    public int size() {
//        return index;
//    }
//    //cd phương thức isEmpty
//    public boolean isEmpty() {
//        if (index == 0) {
//            return true;
//        } return false;
//    }
//    //cd phương thức isFull
//    public boolean isFull() {
//        if (index == size ) {
//            return true;
//        } return false;
//    }
//    //cd lớp StackClient chứa phương thức main
//
//        public static void main(String[] args) {
//            MyStack stack = new MyStack(5);
//
//            stack.push(5);
//            stack.push(4);
//            stack.push(3);stack.push(4);
//            stack.push(2);
//            stack.push(1);
//            System.out.println(stack.size());
//
//    }
//
//}
