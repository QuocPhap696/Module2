package S1IntroductionToJava.BT1.inherit;

public abstract class Geometric {
    private String color;
    private String filled;

    public Geometric() {
    }

    public Geometric(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilled() {
        return filled;
    }

    public void setFilled(String filled) {
        this.filled = filled;
    }


    public String toString() {
        return "created with \"" + color + "\"color and" +
                (filled == null ? "no fill" : "filled with \"" + filled + "\"color");
    }

    public abstract double getArea();
}
