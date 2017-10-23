//Robert O'Driscoll - Canvas stores a list of primitives that should be drawn
// It uses the memento design pattern to support undo operations
// It is the subject in the observer pattern, calls notifyObservers when state changes
// so Observers can redraw the primitives

package ie.cs4227.project.ui.components;
import ie.cs4227.project.primitives.Primitive;

import java.util.ArrayList;

public class Canvas implements Originator, CanvasSubject{
    private ArrayList<Primitive> primitives; //state in memento design pattern
    private ArrayList<CanvasObserver> canvasObservers;

    public Canvas(){
        primitives = new ArrayList<>();
        canvasObservers = new ArrayList<>();
    }

    public void addPrimitive(Primitive primitive){
        primitives.add(primitive);
    }

    public ArrayList<Primitive> getPrimitives() {
        return primitives;
    }

    public void removePrimitive(Primitive primitive){
        primitives.remove(primitive);
    }

    //Observer Design Pattern
    @Override
    public void attach(CanvasObserver canvasObserver) {
        canvasObservers.add(canvasObserver);
    }

    @Override
    public void detach(CanvasObserver canvasObserver) {
        canvasObservers.remove(canvasObserver);
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i < canvasObservers.size(); i++){
            canvasObservers.get(i).update();
        }
    }
    //end observer code


    //Originator(Memento)
    public void restore(Memento m){
        ConcreteMemento concreteMemento = (ConcreteMemento)m;
        this.primitives = concreteMemento.getState();
    }

    public Memento createMemento() {
        ConcreteMemento concreteMemento = new ConcreteMemento();
        concreteMemento.setState(this.primitives);
        return concreteMemento;
    }


    //Implementation of memento interface
    class ConcreteMemento implements Memento {
        ArrayList<Primitive> state;

        public ArrayList<Primitive> getState(){
            ArrayList<Primitive> temp = new ArrayList<>();

            for(int i = 0; i < state.size(); i++){
                temp.add(state.get(i).clone());
            }

            return temp;
        }

        public void setState(ArrayList<Primitive> state){
            //Deep copy of state arraylist

            ArrayList<Primitive> temp = new ArrayList<>();

            for(int i = 0; i < state.size(); i++){
                temp.add(state.get(i).clone());
            }

            this.state = temp;
        }
    }

    //end Originator code
}
