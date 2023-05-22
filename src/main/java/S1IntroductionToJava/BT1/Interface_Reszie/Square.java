package S1IntroductionToJava.BT1.Interface_Reszie;

import S1IntroductionToJava.BT1.inherit.Geometric;

public class Square extends Geometric implements Resizeable {
private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    public Square() {
    }

    @Override
    public double getArea() {
       return this.edge * this.edge;
    }

    @Override
    public void resize(double percent) {
        this.edge = this.edge * percent;
    }
}
