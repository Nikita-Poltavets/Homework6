package com.homework.nix.service.impl;

import com.homework.nix.exception.VehicleException;
import com.homework.nix.service.VehicleService;

public class VehicleServiceImpl implements VehicleService {

    private boolean isVehicleWork = true;

    @Override
    public void isWork(){
        if(isVehicleWork){
            System.out.println("Транспортное средство работает.");
        } else {
          throw new VehicleException("Транспортное средство не работает.");
        }
    }

}
