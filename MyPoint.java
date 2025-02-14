public class MyPoint {
    private int x;
    private int y;

    // Constructor with two parameters
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters and setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Calculates the distance between another MyPoint object 
    public double distance(MyPoint other) {
        int xDiff = this.x - other.x;
        int yDiff = this.y - other.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
