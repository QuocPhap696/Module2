package S1IntroductionToJava.BT1.AnimalAndInterface;

public class Orange extends Fruit implements Edible{
    @Override
    public void howtoEat() {
        System.out.println("Lột vỏ xong bóc từng muối");
    }
}
