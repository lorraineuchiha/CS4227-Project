package ie.cs4227.project;

import ie.cs4227.project.drawing.V1_Drawing;
import ie.cs4227.project.drawing.V2_Drawing;
import ie.cs4227.project.primitives.Circle;
import ie.cs4227.project.primitives.Rectangle;
import ie.cs4227.project.primitives.Text;

public class testcase {
    public static void main(String[] args) {

        Circle testCircle = new Circle(10, 10, 10, new V1_Drawing() );
        Circle testCircle2 = new Circle(12, 23, 9, new V2_Drawing() );
        Rectangle testRect = new Rectangle(10, 12, 10, 12, new V2_Drawing());
        Text testText = new Text(20, 20, "This is some test text", new V1_Drawing());



        testCircle.draw();
        testCircle2.draw();
        testRect.draw();
        testText.draw();
        }
    }
