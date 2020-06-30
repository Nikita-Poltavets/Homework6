package com.homework.nix.service.impl;

import com.homework.nix.exception.VehicleException;
import com.homework.nix.service.VehicleService;

public class WorkProcessServiceImpl implements VehicleService {

    private boolean isVehicleWork = true;
    private boolean isWeatherSatisfactory = true;

    @Override
    public void isWork(){
        if(isVehicleWork){
            System.out.println("Транспортное средство работает.");
        } else {
            throw new VehicleException("Транспортное средство не работает.");
        }
        if(isWeatherSatisfactory){
            System.out.println("Оптимальные погодные условия");
        } else {
            throw new VehicleException("Неудовлетворительные погодные условия");
        }
    }
}
