package S1IntroductionToJava.BT1.BTthayQuang.Point;

public class point2D {
   //Biến x này để làm gì ?
   // là biến instance(biến toàn cục) và có giá trị mặc định(0.0f)
   private float x;
   private float y;
   //Hàm khởi tạo để làm gì?
   // sử dụng để khởi tạo đối tượng(ở trong đó cập nhật giá trị thuộc tính của hắn)
   public point2D(){
   }
   public point2D(float x, float y){
      this.x = x;
      this.y = y;
   }
   //Getter, setter để làm gì ?
   // truy cập và cập nhật thuôc tính(x, y)
   public float getX() {
      return this.x;
   }
   public float getY() {
      return  this.y;
   }
   public void setX() {
      this.x = x;
   }
   public void setY() {
      this.y = y;
   }
   public void setXY(float x, float y) {
      this.x = x;
      this.y = y;
   }
   public float [] getXY() {
      float [] xy = new float[2];
      xy[0] = x;
      xy[1] = y;
      return xy;
   }

   // phương thức toString() từ đâu ra và nó để làm gì ?
   //pthuc toString nằm trong lớp object, mặc định 1 lớp sẽ kế thừa object nên sẽ thừa hưởng được pthuc toString
   // nó để làm gì ? để hiển thị thông tin của đối tượng(trả về một chuỗi).

   // Tại sao phải ghi đè phương thức ?
   // vì ko muốn sử dụng pthuc toString của lớp object nên nó sẽ ghi đè để hiển thị theo cách của nó.

   @Override
   public String toString() {
      return String.format("(%s, %S)", this.x, this.y);
   }
}
