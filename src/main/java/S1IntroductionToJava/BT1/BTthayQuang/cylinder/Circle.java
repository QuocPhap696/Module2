package S1IntroductionToJava.BT1.BTthayQuang.cylinder;

public class Circle {
    protected float radius;
    protected String color;

    public Circle() {

    }
    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Circle(float radius) {
        this.radius = radius;
        this.color = "BLACK";
    }
    //get và set : kiểm soát quyền truy cập và cập nhật thuộc tính đối tượng
    public void getRadius(float radius) {
        if (radius < 0) {
            System.out.println("Bán kính ko hợp lệ");
        }
        else {
            this.radius = radius;
        }
    }
    public void setRadius(float radius){
        this.radius = radius;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public float getArea() {
        return (float) (this.radius * radius * Math.PI);
    }
    //hàm toString: mặc định trong object, mọi lớp đều kế thừa từ object nên sẽ thừa hưởng được.
    // vì ko muốn xài của lớp cha mà muốn định nghĩa lại nên dùng override

//    this.radius lấy thông tin radius được, ko cần this cũng okee(vì nó sẽ tự hiểu là this.color)
    @Override
    public String toString() {
//        return "Cirle" + this.radius + "Color" + this.color + "Area" + this.getArea();
    return String.format("Cirle : %s, color : %s, Area : %s",
     this.radius, this.color,this.getArea());
    }
}
