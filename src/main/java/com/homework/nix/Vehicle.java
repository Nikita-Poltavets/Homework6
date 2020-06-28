package com.homework.nix;

public class Vehicle {

    private boolean isVehicleWork = true;

    public void isWork(){
        if(isVehicleWork){
            System.out.println("Транспортное средство работает.");
        } else {
          throw new VehicleException("Транспортное средство не работает.");
        }
    }

}
