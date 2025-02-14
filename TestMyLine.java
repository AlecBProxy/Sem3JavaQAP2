public class TestMyLine {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);

        MyLine line1 = new MyLine(p1, p2);
        System.out.println(line1); 

        MyLine line2 = new MyLine(0, 0, 3, 4);
        System.out.println(line2); 

        System.out.println("Length: " + line2.getLength()); 

        System.out.println("Gradient: " + Math.toDegrees(line2.getGradient())); 
    }
}
