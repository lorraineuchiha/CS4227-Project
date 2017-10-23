//Robert O'Driscoll - Caretaker from Memento design pattern, changes to canvas should go
// through this class to allow states to be stored / restored

package ie.cs4227.project.ui.components;

import ie.cs4227.project.primitives.Primitive;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> mementoStack;
    private Stack<Originator> originatorStack; //Not sure if this is needed
    private Canvas canvas;

    public Caretaker(){
        mementoStack = new Stack<>();
        originatorStack = new Stack<>();
    }

    public void setCanvas(Canvas canvas){
        this.canvas = canvas;
    }

    public void undo(){
        Originator o = originatorStack.pop();
        o.restore(mementoStack.pop());

        canvas.notifyObservers();
    }

    public void addPrimitive(Primitive primitive){

        mementoStack.push(canvas.createMemento());
        originatorStack.push(canvas);

        canvas.addPrimitive(primitive);

        canvas.notifyObservers();
    }

}

