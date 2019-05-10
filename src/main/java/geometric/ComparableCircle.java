package geometric;

//import java.lang.Comparable;

public class ComparableCircle extends Circle implements Comparable <ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo (ComparableCircle e) {
        if (this.radius > e.getRadius()) return 1;
        else if (this.radius < e.getRadius()) return -1;
        else return 0;
    }
}
