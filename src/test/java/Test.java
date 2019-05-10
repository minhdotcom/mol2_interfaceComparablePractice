import geometric.*;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCircle [] circles = new ComparableCircle[3];
        circles [0] = new ComparableCircle(5.0);
        circles [1] = new ComparableCircle(4.0);
        circles [2] = new ComparableCircle(3.0, "red", true);

        System.out.println("Pre sort: ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After sort: ");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
