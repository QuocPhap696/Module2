package S1IntroductionToJava.BT1.animal;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("CHÓ");
        System.out.println(dog);
        dog.eat();
        dog.Bark();
        System.out.println("-----------------");

        Bird bird = new Bird();
        bird.setName("Chim sẻ");
        System.out.println(bird);
        bird.eat();
        bird.Flyable();
        System.out.println("-----------------");

        Car car = new Car();
        car.setName("Toyota");
        System.out.println(car);
        car.Runable();
        car.turnOnTheLight();
        System.out.println("-----------------");

        Fish fish = new Fish();
        fish.setName("Cá Chép");
        System.out.println(fish);
        fish.eat();
        fish.Swim();
        System.out.println("-----------------");

        Plane plane = new Plane();
        plane.setName("A370");
        System.out.println(plane);
        plane.Flyable();
        plane.turnOnTheLight();
    }


}
