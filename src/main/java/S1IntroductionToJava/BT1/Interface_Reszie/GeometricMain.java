package S1IntroductionToJava.BT1.Interface_Reszie;

public class GeometricMain {
    public static void main(String [] args) {
        Geometric geometric = new Rectangle(4,5);
        System.out.println("Diện tích : " + geometric.getArea());

        geometric.resize(0.5f);
        System.out.println("Diện tích sau khi reszie :" + geometric.getArea());
    }
}
