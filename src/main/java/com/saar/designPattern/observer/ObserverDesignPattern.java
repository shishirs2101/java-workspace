package com.saar.designPattern.observer;


import java.util.ArrayList;
import java.util.List;



/**
 * Definition:
 * Notify other object (observer object) if one object (subject) state changes to it dependent object.
 * If an object or state of object has one-to-many dependencies on other object.
 * -------------------------------------------------------------------------------------
 * The Observer Design Pattern is a behavioral design pattern that defines a one-to-many dependency between objects
 * so that when one object (the subject) changes state, all its dependents (observers) are notified and updated automatically.
 * ------------------------------------------------------------------------------------
 * Component:
 * Subject --interface
 * Concreate subject   --class
 * Observer  --interface
 * Concreate Observer  --class
 * ------------------------------------------------------------------------------------
 * Description:
 * If Subject changes it's state then notify the observer.
 * E.g: server-client connection, where client application will check the server application is up or down.
 **/
public class ObserverDesignPattern {

}


interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}

interface Observer {
    void update();
}

/**
 * This is concreate Subject class.
 */

class ServerDetails {
    public boolean isAlive = true;
    public String zone = "west-b";


    public ServerDetails(boolean isAlive, String zone) {
        this.isAlive = isAlive;
        this.zone = zone;
    }
}
class Server implements Subject {
    static final List<Observer> observerList = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);

    }

    @Override
    public void notifyObservers() {
        observerList.forEach(Observer::update);

    }
}

/** Client1 and Client2 are concreate observer classes*/

class Client1 implements Observer {
    boolean serverStatus = true; // if server is up.
    @Override
    public void update() {


    }
}

class Client2 implements Observer {

    @Override
    public void update() {

    }
}