package S1IntroductionToJava.BT1.animal;

public class Car extends Machine implements Runable {
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
        System.out.println("Chạy tốc độ bàn thờ");
    }

    @Override
    public void turnOnTheLight() {
        System.out.println("Sáng đau mắt");
    }
}
