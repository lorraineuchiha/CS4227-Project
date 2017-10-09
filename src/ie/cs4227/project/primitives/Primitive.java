package ie.cs4227.project.primitives;

import ie.cs4227.project.drawing.DrawingProgram;

public abstract class Primitive {
    protected DrawingProgram dp;

    public final void drawLine(int x1, int y1, int x2, int y2) {
        dp.drawLine(x1, y1, x2, y2);
    }
    public final void drawCircle(int x, int y, float r) {
        dp.drawCircle(x, y, r);
    }
    public final void drawText(int x, int y, String text) {
        dp.drawText(x, y, text);
    }

    public void draw() { }
}
