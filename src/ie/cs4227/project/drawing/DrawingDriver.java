//Robert O'Driscoll - Observer of Canvas, iterates through list of primitives when canvas is updated
package ie.cs4227.project.drawing;
import ie.cs4227.project.ui.components.CanvasObserver;
import ie.cs4227.project.ui.components.CanvasSubject;
import ie.cs4227.project.primitives.Primitive;

import java.util.ArrayList;

public class DrawingDriver implements CanvasObserver{

    private CanvasSubject canvasSubject;

    public DrawingDriver(CanvasSubject canvasSubject){

        //Setup observer
        this.canvasSubject = canvasSubject;
        this.canvasSubject.attach(this);
    }

    @Override
    public void update() {

        //Draw each primitive on the canvas

        ArrayList<Primitive> primitives = canvasSubject.getPrimitives();

        for(int i = 0; i < primitives.size(); i++){
            primitives.get(i).draw();
        }
    }
}
