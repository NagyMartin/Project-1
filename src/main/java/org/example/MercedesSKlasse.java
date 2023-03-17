package org.example;

public class MercedesSKlasse extends Mercedes{
    public MercedesSKlasse(float fuelTankSize, int gears, String fuelType, int tireSize, String chassisNumber) {
        super(fuelTankSize, gears, fuelType, tireSize, chassisNumber);
    }
    /**
     * Method starts the engine and sets the initial fuel consumption based on tyre size.
     */
    @Override
    public void start() {
        super.start();
        System.out.println("The Mercedes SKlasse started.");
        while (true) {
            switch (tireSize) {
                case 15 -> {
                    consumptionPer100Km = 9.7;
                }
                case 16, 17, 18, 19 -> {
                    consumptionPer100Km = 9.7;
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
        System.out.println("The Mercedes SKlasse stopped.");
    }

}
