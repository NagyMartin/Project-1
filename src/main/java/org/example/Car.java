package org.example;

public abstract class Car implements Vehicle {
    final float fuelTankSize;
    final int gears;
    double consumptionPer100Km;
    final String fuelType;
    int tireSize;
    final String chassisNumber;
    private float availableFuel;
    float drivingFuelConsumedPer100Km;
    float averageFuelConsumption;
    float consumedFuel = 0;
    int timesCarIsDriven = 0;
    double gearConsumptionPer100Km;

    /**
     *
     * @return Method returns the average fuel consumption by dividing the total fuel consumed by
     * each time drive was initialized.
     */
    public float getAverageFuelConsumption() {
        averageFuelConsumption = consumedFuel / timesCarIsDriven;
        System.out.println("Average fuel consumption is: " + averageFuelConsumption);
        return averageFuelConsumption;
    }

    /**
     *
     * @return Method returns the remaining available fuel.
     */
    public float getAvailableFuel() {
        this.availableFuel = fuelTankSize - consumedFuel;
        System.out.println("Remaining fuel is: " + availableFuel);
        return availableFuel;
    }

    /**
     *
     * @param x is the value added which determines the gear in which the car currently is.
     *          Afterwards consumption is recalculated based on stated gear.
     */
    public void shiftGear(int x) {
        if (x > 0 && x <= gears) {
            switch (x) {
                case 1 -> gearConsumptionPer100Km = consumptionPer100Km;
                case 2, 3, 4, 5, 6 -> gearConsumptionPer100Km = consumptionPer100Km - (x * 0.1);
                default -> System.out.println("Unavailable gear. Please check your gearbox.");
            }
        }
    }

    /**
     *
     * @param x is the value added.
     */
     public void drive(double x) {
    }

    /**
     * Method starts the engine and sets the initial fuel consumption based on tyre size.
     */
    public void start() {
        System.out.println("The car engine started.");
        while (true) {
            switch (tireSize) {
                case 15 -> {
                    consumptionPer100Km = 4.7;
                }
                case 16, 17, 18, 19 -> {
                    consumptionPer100Km = 4.7;
                    consumptionPer100Km = consumptionPer100Km + (tireSize * 0.1);
                }
            }
            break;
        }
    }

    /**
     * Method stops the engine.
     */
    public void stop() {
        System.out.println("The car engine stopped.");
    }


    /**
     * Car constructor
     * @param fuelTankSize -
     * @param gears This parameter in constructor alters the fuel consumption!
     * @param fuelType -
     * @param tireSize This parameter in constructor alters the fuel consumption!
     * @param chassisNumber -
     */
    public Car(float fuelTankSize, int gears, String fuelType, int tireSize, String chassisNumber) {
        this.fuelTankSize = fuelTankSize;
        this.gears = gears;
        this.fuelType = fuelType;
        this.tireSize = tireSize;
        this.chassisNumber = chassisNumber;
        this.consumptionPer100Km = consumptionPer100Km;
        if (gears < 1 && gears > 6) {
            System.out.println("Maximum gears allowed is 6. Please retry.");
            return;
        }
        if(tireSize < 15 && tireSize > 19){
            System.out.println("Tyre size allowed is between 15 and 19");
        }

    }

}
