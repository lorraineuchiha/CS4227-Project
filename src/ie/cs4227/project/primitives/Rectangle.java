package ie.cs4227.project.primitives;

import ie.cs4227.project.drawing.DrawingProgram;

public class Rectangle extends Primitive {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height, DrawingProgram myDrawing) {
        super(myDrawing);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw() {
        myDrawing.drawLine(x,y,width,height);
    }
}
