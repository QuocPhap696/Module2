package S1IntroductionToJava.BT1.AnimalAndInterface;

public class Chicken extends Animal implements Edible{


    @Override
    public void makeSound() {
        System.out.println("ò ó o");

    }

    @Override
    public void howtoEat() {
        System.out.println("Gà nướng");

    }
}
