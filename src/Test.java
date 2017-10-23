import ie.cs4227.project.drawing.DrawingDriver;
import ie.cs4227.project.primitives.Circle;
import ie.cs4227.project.primitives.Rectangle;
import ie.cs4227.project.ui.components.Canvas;
import ie.cs4227.project.ui.components.Caretaker;

public class Test {

  public static void main(String [] args){
      testMemento();
  }

  public static void testMemento(){

      //Demonstrates the memento design pattern

      Canvas myCanvas = new Canvas();

      DrawingDriver drawingDriver = new DrawingDriver(myCanvas);

      Caretaker myCaretaker = new Caretaker();
      myCaretaker.setCanvas(myCanvas);

      Rectangle rectangle = new Rectangle();
      myCaretaker.addPrimitive(rectangle);

      Circle circle = new Circle();
      myCaretaker.addPrimitive(circle);

      myCaretaker.undo();
  }


}
