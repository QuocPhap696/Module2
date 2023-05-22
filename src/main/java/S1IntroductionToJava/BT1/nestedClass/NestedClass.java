package S1IntroductionToJava.BT1.nestedClass;

public class NestedClass {
    public static class Kid {
        private int tuoi;
        public void hello() {
            System.out.println("hello");
        }
    }

    public static void main(String[] args) {
        //gọi đến hàm của Kid
        NestedClass.Kid kid = new  NestedClass.Kid();
        kid.hello();
    }
}
