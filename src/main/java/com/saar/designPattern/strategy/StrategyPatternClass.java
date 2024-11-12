package com.saar.designPattern.strategy;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
import java.util.Random;

/**
 * Strategy patter:
 * Family of different behaviour of object.
 * Dynamically/ Runtime Switch b/w the object of algorithm
 * Component in this pattern are:
 *  1. Strategy interface/abstract class,
 *  2. concrete class with diff algo/behaviour
 *  3. Context class: which will behave as an interface b/w client and concrete class(strategy ).
 *      This class composite
 *  4. Client
 *  --------------- Logic ---------------
 * Problem:
 * In a transportation system, users need to travel from one location to another using different modes of transportation,such as cars, bicycles, and walking.
 * The system should support dynamic selection and switching between these travel modes based on user preferences or travel requirements.
 *  ---------------
 *  Pattern Implementation:
 *  Create Interface class for all type of behaviour(ocean, air, land vehicle).
 *  Create a Behaviour concrete class like (ocean type: steam boat, small ship, large ship, air type: small and large plane)
 *  Context class: has-a reference of all behaviour interfaces.
 *  Client: Client has-a reference of context class and initialized the behaviour of concrete class on runtime.
 *
 * */

public class StrategyPatternClass {
    public static void main(String[] args) {
        TransportGoods transportGoods = new TransportGoods();
        transportGoods.setRoadTransportationMode(new Bike());
        transportGoods.setOceanTransportation(new SmallShip());

        transportGoods.showMode();
    }
}


// Context class
class TransportGoods{
    private RoadTransportationMode roadTransportationMode;
    private OceanTransportation oceanTransportation;

    private DisplayRoute displayRoute;
    public void setRoadTransportationMode(RoadTransportationMode roadTransportationMode){
        this.roadTransportationMode = roadTransportationMode;
    }

    public void setOceanTransportation(OceanTransportation oceanTransportation){
        this.oceanTransportation = oceanTransportation;
    }
    public void showMode(){
        if (Objects.nonNull(roadTransportationMode)){
            roadTransportationMode.roadTransport();
            roadTransportationMode.display();
        }
        if (Objects.nonNull(oceanTransportation)){
             oceanTransportation.oceanTransport();
             oceanTransportation.display();
        }

    }
}

interface DisplayRoute{
    void display();
}


 interface RoadTransportationMode extends DisplayRoute {
    void roadTransport();
}

// Concrete class for road transportation mode
class CarMode implements RoadTransportationMode{
    @Override
    public void roadTransport() {
        System.out.println("Car Mode");
    }

    @Override
    public void display() {
        System.out.println("Display car mode!");
    }
}
class Bike implements  RoadTransportationMode{
    @Override
    public void roadTransport() {
        System.out.println("Bike Mode!");
    }

    @Override
    public void display() {
        System.out.println("Display bike mode");
    }
}


interface OceanTransportation extends  DisplayRoute{
    void oceanTransport();
}

class SmallShip implements  OceanTransportation{
    @Override
    public void oceanTransport() {
        System.out.println("Small Ship!");
    }

    @Override
    public void display() {
        System.out.println("Display small ship mode");
    }
}
class LargeShip implements OceanTransportation{
    @Override
    public void oceanTransport() {
        System.out.println("Large Ship!");
    }

    @Override
    public void display() {
        System.out.println("Display large ship mode");
    }
}