package S1IntroductionToJava.BT1.BTthayQuang.Point;

import java.awt.geom.Point2D;

public class AppPoint {
    public static void main(String[] args) {
        point2D point2D = new point2D(2, 3);
        point3D point3D = new point3D(1, 5, 1);
        System.out.println("Toạ độ của" + point2D);

        //vì sao bỏ vào point2D ko cần chấm toString()
        // vì println tham số đầu vào là object, point2D lại là 1 object thì
        //mặc định sẽ gọi hàm toString(nên dù gọi toString cũng ko thay đổi tác dụng)
        System.out.println(point2D);
        System.out.println("Toạ độ của : point3D");
        System.out.println(point3D.toString());
    }
}
