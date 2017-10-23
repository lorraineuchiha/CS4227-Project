//Robert O'Driscoll - concrete implementation of DrawingProgram interface
// created to test memento and observer design patterns

package ie.cs4227.project.drawing;

public class ConcreteDrawingProgramTest implements DrawingProgram {
    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {

        System.out.println("Draw line");
    }

    @Override
    public void drawCircle(int x, int y, float r) {

        System.out.println("Draw Circle");
    }

    @Override
    public void drawText(int x, int y, String text) {
        System.out.println("Draw Text");

    }
}
