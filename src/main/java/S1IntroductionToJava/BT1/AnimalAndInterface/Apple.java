package S1IntroductionToJava.BT1.AnimalAndInterface;

public class Apple extends Fruit implements Edible{
    @Override
    public void howtoEat() {
        System.out.println("Gọt vỏ rồi mới ăn");
    }
}
