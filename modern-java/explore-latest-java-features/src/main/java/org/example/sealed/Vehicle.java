package org.example.sealed;

public sealed abstract class Vehicle permits Car, Truck {

    public abstract String drive();
}
