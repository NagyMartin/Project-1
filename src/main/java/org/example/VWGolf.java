package org.example;

public class VWGolf extends Volkswagen {
    public VWGolf(float fuelTankSize, int gears, String fuelType, int tireSize, String chassisNumber) {
        super(fuelTankSize, gears, fuelType, tireSize, chassisNumber);
    }

    /**
     * Method starts the engine and sets the initial fuel consumption based on tyre size.
     */
    @Override
    public void start() {
        super.start();
        System.out.println("The Volkswagen Golf started.");
        while (true) {
            switch (tireSize) {
                case 15 -> {
                    consumptionPer100Km = 5.9;
                }
                case 16, 17, 18, 19 -> {
                    consumptionPer100Km = 5.9;
                    consumptionPer100Km = consumptionPer100Km + (tireSize * 0.1);
                }
            }
            System.out.println("Car consumption with set tyres of: " + tireSize +" is: " + consumptionPer100Km);
            break;
        }
    }

    /**
     * Method stops the engine.
     */
    @Override
    public void stop() {
        super.stop();
        System.out.println("The Volkswagen Golf stopped.");
    }

    /**
     * Method overrides the implemented parent method.
     * Fuel Consumption is altered by the parameter value added.
     * @param x is the value added.
     */
    @Override
    public void drive(double x) {
        super.drive(x);
        float drivingFuelConsumedPer100Km = (float) ((x * 0.01) * this.gearConsumptionPer100Km);
        System.out.println("You have driven for: " + x + " kilometres, the fuel consumed is: " + drivingFuelConsumedPer100Km);
        this.drivingFuelConsumedPer100Km = drivingFuelConsumedPer100Km;
        consumedFuel = consumedFuel + drivingFuelConsumedPer100Km;
        drivingFuelConsumedPer100Km = 0;
        timesCarIsDriven++;
    }
}
