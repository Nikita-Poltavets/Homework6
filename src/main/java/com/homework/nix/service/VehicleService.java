package com.homework.nix.service;

import com.homework.nix.exception.VehicleException;

public class VehicleService {

    private boolean isVehicleWork = true;

    public void isWork(){
        if(isVehicleWork){
            System.out.println("Транспортное средство работает.");
        } else {
          throw new VehicleException("Транспортное средство не работает.");
        }
    }

}
