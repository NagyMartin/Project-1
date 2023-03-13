package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Car car = new MercedesCKlasse(27, 6,"Petrol", 15,"oiqe0934hkkadsn");

        car.start();

        car.shiftGear(1);

        car.drive(10); // drives 0.01 KMs

        car.shiftGear(2);

        car.drive(0.02);

        car.shiftGear(3);

        car.drive(0.5);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(5);

        car.drive(10);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(3);

        car.drive(0.1);

        car.stop();

        float availableFuel = car.getAvailableFuel();

        float fuelConsumedPer100Km = car.getAverageFuelConsumption();
    }
}
