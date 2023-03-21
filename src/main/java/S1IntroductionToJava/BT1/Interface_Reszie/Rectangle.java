package S1IntroductionToJava.BT1.Interface_Reszie;

import java.io.IOException;
import java.nio.CharBuffer;

public class Rectangle extends Geometric{
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float getArea() {
        return this.width * this.height;
    }

    @Override
    public void resize(float percent) {
        this.width = (float) (this.width* Math.sqrt(percent));
        this.height = (float) (this.height*Math.sqrt(percent));
    }

}
