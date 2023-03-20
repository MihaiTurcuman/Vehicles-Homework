package org.example;

public class Logan extends Dacia{
    public final int tank_size = 50;
    public final String fuel_type = "diesel";
    public final double factory_fuel_consumption = 5.4;


    Logan(int available_fuel, String chassis_number) {
        setAvailable_fuel(available_fuel);
        this.chassis_number = chassis_number;

    }

    public double getFuel_consumption() {
        return factory_fuel_consumption;
    }


    @Override
    public void changeTyreSize(int size) {
        this.tyre_size = size;
    }
}
