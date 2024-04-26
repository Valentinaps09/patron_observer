package co.edu.uniquindio.poo;

public interface Observable {
    void addObserver(Observer o);

    void deleteObserver(Observer o);

    void notifyObservers();

}
