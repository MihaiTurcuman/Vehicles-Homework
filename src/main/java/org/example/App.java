package org.example;

/**
 * DESCRIPTION
 *
 * create an application based on the following requirements
 * All Vehicles (e.g Car, Bike, Horse, Boat, Plane) have the following behavior: they can be started, stopped and driven for a number of kilometers
 * Implement a hierarchy of Car classes where:
 * Car is a type of Vehicle
 * properties of a Car model which cannot change: fuelTankSize, fuelType (PETROL, DIESEL, etc...), gears (max 6), consumptionPer100Km (e.g 4.7)
 * properties that are configurable: availableFuel, tireSize (15, 16, 17, etc...)
 * //available fuel, tireSize
 * properties that are instance specific: chassisNumber
 * // chassis number
 * consumptionPer100Km is the consumption of the car per 100 KM with the smallest tire setting (15) in first gear
 * Behavior
 * during a start() and a stop() the car keeps track of the how much it has consumed
 * on every start() the consumption stats are reset
 * a car can be driven for N kms in different gears
 *
 *
 *
 * //Vehicle, Car, Dacia, Logan
 *
 * Logan is a Dacia, Dacia is a car, Car is a vehicle
 *
 * // fuelTankSize, fuelType , consumptionPer100Km, chassisNumber<-- final
 *
 * // available fuel, tireSize, chassisNumber
 *
 * // keep track of fuel
 * // resets stats (after stopping)
 * // shift gear
 * // action start, stop, drive
 *
 */
public class App {
    public static void main(String[] args) {

        Car car = new Logan (15, "DCDZB11558787"); // Logan can extend from Dacia; Dacia extends from Car

        car.start ();

        car.shiftGear (1);

        car.drive (0.1); // drives 200 KMs

        car.shiftGear (2);

        car.drive (0.3);

        car.shiftGear (3);

        car.drive (25);

        car.shiftGear (4);

        car.drive (88);

        car.shiftGear (5);

        car.drive (175);

        car.shiftGear (6);

        car.drive (250);


        car.stop ();

        float availableFuel = (float) car.getAvailableFuel ();

        float fuelConsumedPer100Km = car.getAverageFuelConsumption ();


        Object Passat = new Object ();
        Vehicle vehicle = new Vehicle () {

            org.example.Passat car = new Passat (50, "WVW3CZ5252548758");

            @Override
            public void drive(double distance) {

            }
        };

        vehicle.start ();

        vehicle.drive (100);

        vehicle.stop ();


    }
}
