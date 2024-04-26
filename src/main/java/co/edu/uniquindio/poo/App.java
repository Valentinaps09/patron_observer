package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        EjemploObservable observable = new EjemploObservable();
        observable.addObserver(new EjemploObserver1());
        observable.addObserver(new EjemploObserver2());
        observable.addObserver(new EjemploObserver3());

        
        observable.notifyObservers();
    }
}
