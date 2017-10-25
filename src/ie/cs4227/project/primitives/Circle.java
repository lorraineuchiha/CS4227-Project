package ie.cs4227.project.primitives;

import ie.cs4227.project.drawing.DrawingProgram;

public class Circle extends Primitive {
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius, DrawingProgram myDrawing) {
        super(myDrawing);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        myDrawing.drawCircle(x,y,radius);
    }
}
