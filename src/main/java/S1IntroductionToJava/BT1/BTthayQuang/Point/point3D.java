package S1IntroductionToJava.BT1.BTthayQuang.Point;

public class point3D extends point2D {
    private float z;

    public point3D(float x, float y, float z) {
        super(x, y); //super gọi đến constructor lớp cha(point2D)
        this.z = z;

        //cách 2 : gọi đến phương thức
     // this.setX(x);
     // this.setY(y);

        //cách 3 :super.set : gọi đến phương thức
     // super.setX(x);
     // super.setY(y);
    }
    public point3D() {
        //chỗ này có ý nghĩa gì ?
        //tự super lên lớp cha(bên point 2D)
    }
    public float getZ() {
        return this.z;
        //this: đại diện cho đối tượng hiện tại (point 3D) mà point 3D có thuộc tính là z
        // thì mình có thể truy cập đến z
    }
    public void setZ() {
        this.z = z;
    }
    public float [] getXYZ() {
        float[] xyz = new float[3];
        // Chỗ này là sao
        // vì sao getX() cũng được, mà this.getX() cũng được, super.getX cũng được
        // vì gọi được đến pthuc bên point2D(getX).
        // vì point 3D thừa hưởng được lớp cha
        xyz[0] = getX();
        xyz[1] = super.getY();
        xyz[2] = this.getZ();

        return xyz;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %s)", this.getX(), this.getY(), this.z);
    }
}


