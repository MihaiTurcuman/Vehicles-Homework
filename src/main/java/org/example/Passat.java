package org.example;

public class Passat extends Volkswagen {


    public final int tank_size = 60;
    public final String fuel_type = "diesel";
    public final double factory_fuel_consumption = 6.4;


    Passat(int available_fuel, String chassis_number) {
        setAvailable_fuel(available_fuel);
        this.chassis_number = chassis_number;

    }

    public double getFuel_consumption() {
        return factory_fuel_consumption;
    }


}
