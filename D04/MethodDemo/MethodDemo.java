/**
 * MethodDemo
 */
public class MethodDemo {
    public static void main(String[] args) {
        double length = 29.21;
        double width = 32.12;
        System.out.println(area(length, width));
    }

    private static double area(double length, double width) {
        return length*width;
    }
}