package ie.cs4227.project.drawing;

public class V1_Drawing implements DrawingProgram {
    public void drawLine(int x1, int y1, int x2, int y2) {
        System.out.println("Line with values: X1: " + x1 + ", Y1: " + y1 + ", X2: " + x2 + ", Y2: " + y2);

    }

    public void drawCircle(int x, int y, float r) {
        System.out.println("Circle with values: X: " + x + ", Y: " + y + ", Radius: " + r);
    }

    public void drawText(int x, int y, String text) {
        System.out.println("Text with values: X: " + x + ", Y: " + y + ", Text: " + text);
    }
}
