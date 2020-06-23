package com.codeWithArsalon.Composite.solution;

public class Truck implements Component {
    //Inherits a single abstract method from Parent Interface

    @Override
    public void deploy() {
        System.out.println("Truck Resource Deployed");
    }
}
