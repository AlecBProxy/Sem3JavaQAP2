public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle rect1 = new MyRectangle(1, 7, 3, 2);
        System.out.println(rect1);

        MyPoint p1 = new MyPoint(2, 6);
        MyPoint p2 = new MyPoint(5, 2);
        MyRectangle rect2 = new MyRectangle(p1, p2);
        System.out.println(rect2);

        rect2.setTopLeft(new MyPoint(0, 3));
        rect2.setBottomRight(new MyPoint(4, 9));
        System.out.println("Updated Rectangle: " + rect2);

        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());


    }
}
