package S1IntroductionToJava.BT1.animal;

public class Dog extends Animal implements Barkable, Runable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName();
    }


    @Override
    public void Runable() {
        System.out.println("Chạy bằng 4 chân");
    }

    @Override
    public void eat() {
        System.out.println("Ăn cơm chó");
    }

    @Override
    public void Bark() {
        System.out.println("Gâu gâu gâu");
    }
}
