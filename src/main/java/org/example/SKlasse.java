package org.example;

public class SKlasse extends Mercedes {


    public final int tank_size = 80;
    public final String fuel_type = "diesel";
    public final double factory_fuel_consumption = 11.2;


    SKlasse(int available_fuel, String chassis_number) {
        setAvailable_fuel (available_fuel);
        this.chassis_number = chassis_number;

    }

    public double getFuel_consumption() {
        return factory_fuel_consumption;
    }
}

