public class RectangleTest {
    public static void main(String[] args) {
        Rectangle2 rectangle = new Rectangle2();
        System.out.println(rectangle);

        rectangle = new Rectangle2(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle2(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
    }
}