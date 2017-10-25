package ie.cs4227.project.drawing;

public interface DrawingProgram {
    public void drawLine(int x1, int y1, int x2, int y2);
    public void drawCircle(int x, int y, float radius);
    public void drawText(int x, int y, String text);
}
