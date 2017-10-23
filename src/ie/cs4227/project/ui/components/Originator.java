package ie.cs4227.project.ui.components;

public interface Originator {
    void restore(Memento m);
    Memento createMemento();
}
