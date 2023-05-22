package S1IntroductionToJava.BT1.nestedClass;

public class instance {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setTen("A");
        p1.setTuoi(10);

        Person p2 = new Person();
        p2.setTen("B");
        p2.setTuoi(13);

        System.out.println(p1.getTen()+ " " +p1.getTuoi());
        System.out.println(p2.getTen() + " " + p2.getTuoi());
    }
}
