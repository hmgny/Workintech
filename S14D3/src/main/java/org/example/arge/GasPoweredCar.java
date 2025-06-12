package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    double averageKmPerLiter;
    int cylinders;

    public GasPoweredCar(String name, String description, double averageKmPerLiter, int cylinders){
        super(name, description);
        this.averageKmPerLiter = averageKmPerLiter;
        this.cylinders = cylinders;
    }
    public double getAverageKmPerLiter() {
        return averageKmPerLiter;
    }

    public void setAverageKmPerLiter(double averageKmPerLiter) {
        this.averageKmPerLiter = averageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }


    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + ": Igniting gas-powered engine with " + cylinders + " cylinders.");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + ": Driving a gas-powered car...");
        runEngine();
    }
}
