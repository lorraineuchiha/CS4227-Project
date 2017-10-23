package ie.cs4227.project.ui.components;

import ie.cs4227.project.primitives.Primitive;

import java.util.ArrayList;

public interface CanvasSubject {
    void attach(CanvasObserver canvasObserver);
    ArrayList<Primitive> getPrimitives();
    void detach(CanvasObserver canvasObserver);
    void notifyObservers();
}