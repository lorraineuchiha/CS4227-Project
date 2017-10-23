package ie.cs4227.project.drawing;

public interface DrawingProgram {
    void drawLine(int x1, int y1, int x2, int y2);
    void drawCircle(int x, int y, float r);
    void drawText(int x, int y, String text);
}
