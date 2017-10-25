package ie.cs4227.project.primitives;

import ie.cs4227.project.drawing.DrawingProgram;

public abstract class Primitive {
    protected DrawingProgram myDrawing;

    protected Primitive(DrawingProgram drawing) {
        myDrawing = drawing;
    }

    public abstract void draw();
}
