package ie.cs4227.project.primitives;

public class Rectangle extends Primitive {
    private int x;
    private int y;
    private int width;
    private int height;

    public void draw() {
        drawLine(x, y,x + width, y);
        drawLine(x, y, x, y + height);
        drawLine(x + width, y, x + width, y + height);
        drawLine(x, y + height, x + width, y + height);
    }
}
