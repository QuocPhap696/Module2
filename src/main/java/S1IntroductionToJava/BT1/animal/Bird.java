package S1IntroductionToJava.BT1.animal;

public class Bird extends Animal implements Flyable{
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
    public void Flyable() {
        System.out.println("Bay cao vừa vừa");
    }


    @Override
    public void eat() {
        System.out.println("Ăn sâu");
    }
}
