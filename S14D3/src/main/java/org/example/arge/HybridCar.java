package org.example.arge;

public class HybridCar extends CarSkeleton{
   private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;


    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders ){
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders =cylinders;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLitre;
    }

    public void setAvgKmPerLitre(double avgKmPerLitre) {
        this.avgKmPerLitre = avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + ": Starting hybrid engine with " + cylinders + " cylinders and battery size of " + batterySize + " kWh.");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + ": Driving a hybrid car...");
        runEngine();
    }
}
