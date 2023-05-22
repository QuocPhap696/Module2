package S1IntroductionToJava.BT1.Interface_Reszie;

import java.io.IOException;
import java.nio.CharBuffer;

public class Circle extends Geometric {
    private float radius;



    public Circle (float radius) {
        this.radius = radius;
    }
    public Circle() {

    }

    @Override
        public float getArea() {
        return (float) (Math.PI*this.radius*this.radius);
    }

    @Override
    public void resize(float percent) {
        this.radius = this.radius* percent;

    }
}
