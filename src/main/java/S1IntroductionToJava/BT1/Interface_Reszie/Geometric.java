package S1IntroductionToJava.BT1.Interface_Reszie;

public abstract class Geometric{

    protected String color;
    protected boolean filled;

    public abstract float getArea();
    public Geometric(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public Geometric() {

    }
    @Override
    public String toString() {
        return String.format("Geometric color: %s, filled: %s",  color, filled);
    }
    public void resize(float percent){
    };

}
