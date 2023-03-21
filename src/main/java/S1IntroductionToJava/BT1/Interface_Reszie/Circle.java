package S1IntroductionToJava.BT1.Interface_Reszie;

import java.io.IOException;
import java.nio.CharBuffer;

public abstract class Circle extends Geometric {
    private float radius;



    public Circle (float radius) {
        this.radius = radius;
    }
    public Circle() {

    }

    // chỗ này là sao ?
    //ghi đè phương thức tính diện tích lên lớp cha geometric

    @Override
    public float getArea() {
        return (float) (Math.PI*this.radius*this.radius);
    }

    @Override
    public void resize(float percent) {
        this.radius = this.radius* percent;

    }

}
