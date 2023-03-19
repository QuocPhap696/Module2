package S1IntroductionToJava.BT1.BTthayQuang.cylinder;

public class Cylinder extends Circle {
    protected float height;

    public Cylinder() {
        // khởi tạo hàm ko tham số : mặc định sẽ gọi lên lớp cha
    }
    public Cylinder(float height, float radius, String color) {
        //cách 1 : super: gọi lên hàm khởi tạo lóp cha
//        super(radius, color);

        //cách 2:
        // vì sao this.color và this.radius được ?
        // vì được kế thừa từ lớp cha Circle (circle (protected))
        this.height = height;
        this.color = color;
        this.radius = radius;

        //cách 3: vì sao gọi được setColor :  vì lớp có được nên lớp con gọi được
//        setColor(color);
//        setRadius(radius);

        //cách 4 : vì sao gọi được super.setColor(color) ?
        // vì super này đến phương thức. còn super trên gọi đến lớp cha
//        super.setColor(color);
//        super.setRadius(radius);

        this.height = height;
    }

    // tại sao phải ghi đè phương thức getArea ?
    // vì lớp cha cũng pthuc tính diện tích nhưng lớp con ko muốn thừa hưởng nên phải ghi đè
    @Override
    public float getArea() {
        //nếu lấy this.getArea() thì sẽ xảy ra ?
        // sẽ lấy diện tích hiện tại ( thằng cha(radius * radius * PI)) rồi tính, xảy ra vòng lặp vô tận. còn super
        // gọi thẳng lên lớp cha
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder : %s, color : %s, Area : %s",
                this.radius, color, this.getArea());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(4, 10, "red");
        System.out.println(cylinder);
        // ở đây sử dụng tính chất gì ?
        // tính chất đa hình (1 biến thuộc kiểu dữ liệu lớp cha, có thể tham chiếu đối tượg lớp con)
        Circle c1 = new Cylinder(4, 10, "greeb");

        //c1.getArea lấy từ pthuc của lớp
        float area = c1.getArea();
        System.out.println("get Area :" + area);
    }
}
