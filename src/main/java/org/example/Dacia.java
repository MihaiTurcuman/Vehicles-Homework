package org.example;

public abstract class Dacia extends Car {
    private final int default_tyre_size = 15;

    public void changeTyreSize(int size) {
        this.tyre_size = size;
    }


    @Override
    public void drive(double distance) {

        if (vehicle_is_started) {


            consumption_delta = ((double) (tyre_size - default_tyre_size) / 100) * getFuel_consumption ();
            fuel_used = (distance * (getFuel_consumption () + consumption_delta) / 100);
            setAvailable_fuel (getAvailableFuel () - fuel_used);

            System.out.println ("Driven " + distance + " kilometers");
            System.out.println ("Fuel used " + fuel_used);

        } else System.err.println ("Car not started");
    }
}

