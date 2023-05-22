package S1IntroductionToJava.BT1.animal;

public class Plane extends Machine implements Flyable {
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
        System.out.println("Bay trên bầu trời");
    }

    @Override
    public void turnOnTheLight() {
        System.out.println("Sáng cả bầu trời");
    }
}
