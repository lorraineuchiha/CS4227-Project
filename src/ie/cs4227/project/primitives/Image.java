package ie.cs4227.project.primitives;

import ie.cs4227.project.drawing.DrawingProgram;

public class Image extends Primitive {
    private int x;
    private int y;
    private String text;

    protected Image(int x, int y, String text, DrawingProgram myDrawing) {
        super(myDrawing);
        this.x = x;
        this.y = y;
        this.text = text;
    }

    public void draw() {
        myDrawing.drawText(x, y, text);
    }
}
