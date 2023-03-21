package S1IntroductionToJava.BT1.Interface_Reszie;

public abstract class Geometric{
    //trong lớp abstract có được cái chi ?
    // lớp abstract có các phương thức trừu tượng ko có thân phương thức.
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
//    public static void main(String [] args){
//        Circle circle = new Circle();
//    }

    public void resize(float percent){
    };

}
