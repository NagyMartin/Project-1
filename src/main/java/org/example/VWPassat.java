package org.example;

public class VWPassat extends  Volkswagen{
    public VWPassat(float fuelTankSize, int gears, String fuelType, int tireSize, String chassisNumber) {
        super(fuelTankSize, gears, fuelType, tireSize, chassisNumber);
    }

    /**
     * Method starts the engine and sets the initial fuel consumption based on tyre size.
     */
    @Override
    public void start() {
        super.start();
        System.out.println("The Volkswagen Passat started.");
        while (true) {
            switch (tireSize) {
                case 15 -> {
                    consumptionPer100Km = 8.5;
                }
                case 16, 17, 18, 19 -> {
                    consumptionPer100Km = 8.5;
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
        System.out.println("The Volkswagen Passat stopped.");
    }

}
