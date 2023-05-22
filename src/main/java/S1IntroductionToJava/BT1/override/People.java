package S1IntroductionToJava.BT1.override;

public class People extends Animal{
    private String address;
    private String id;
    private String email;

    public void speak() {
        this.saySomething();
    }

    @Override
    public void move() {
        System.out.println("Con người thì chạy");
    }
}
