package ie.cs4227.project.primitives;

public class Circle extends Primitive {
    private int x;
    private int y;
    private int radius;

    public void draw() {
        drawCircle(x, y, radius);
    }

    public Circle(){
        //For testing only
        x = 10;
        y = 10;
        radius = 100;

    }

    @Override
    public Primitive clone() {
        //to be implemented - may be part of factory design pattern
        return this;
    }
}
