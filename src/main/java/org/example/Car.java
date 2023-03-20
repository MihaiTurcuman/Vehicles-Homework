package org.example;

public abstract class Car extends Vehicle {

    public static final int MAX_GEARS = 6;
    boolean vehicle_is_started;
    double consumption_delta = 0;
    int tyre_size;
    String chassis_number;
    double fuel_used;
    private int current_gear = 0;
    private double available_fuel;
    String fuel;

    void setAvailable_fuel(double available_fuel) {
        this.available_fuel = available_fuel;
    }

    public void shiftGear(int gear) {
        if ((gear > 6) | (gear < 0)) {
            System.err.println("Gear not found");
        } else
            current_gear = gear;

    }


    double getAvailableFuel() {
        return available_fuel;
    }

    @Override
    public void start() {
        System.out.println("Vehicle has started");
        this.vehicle_is_started = true;
        fuel_used = 0; //fuel consumption reset
    }

    public void stop() {
        System.out.println("Vehicle has stopped");
        this.vehicle_is_started = false;

    }


    @Override
    public void drive(double distance) {

        if (vehicle_is_started) {

            //consumption based on the gear the car is using

            consumption_delta = ((double) (MAX_GEARS - current_gear) / 10) * getFuel_consumption();
            fuel_used = (distance * (getFuel_consumption() + consumption_delta) / 100);
            available_fuel -= fuel_used;

            System.out.println("Driven " + distance + " kilometers");
            System.out.println("Trip 1 " + fuel_used);

        } else System.err.println("Car not started!");
    }
}
