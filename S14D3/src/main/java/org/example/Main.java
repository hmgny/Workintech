package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;

public class Main {
    public static void main(String[] args) {

        CarSkeleton gasCar = new GasPoweredCar("GasCar", "Efficient gas-powered car", 15.0, 4);
        CarSkeleton electricCar = new ElectricCar("ElectricCar", "Eco-friendly electric car", 300.0, 85);
        CarSkeleton hybridCar = new HybridCar("HybridCar", "Versatile hybrid car", 20.0, 40, 4);
    }
}