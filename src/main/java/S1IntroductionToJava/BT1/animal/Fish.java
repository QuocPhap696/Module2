package S1IntroductionToJava.BT1.animal;

public class Fish extends  Animal implements Swimable{
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
    public void Swim() {
        System.out.println("Bơi dưới nước");
    }

    @Override
    public void eat() {
        System.out.println("Ăn rong rêu");
    }
}
