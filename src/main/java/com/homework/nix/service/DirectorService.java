package com.homework.nix.service;

import com.homework.nix.data.Group;
import com.homework.nix.service.impl.VehicleServiceImpl;

public class DirectorService {

    private VehicleService vehicleService = new VehicleServiceImpl();
    private DirectorResponsibilityService directorResponsibilityService = new DirectorResponsibilityService();

    public void leadTheDevelopmentProcess(Group group){
        vehicleService.isWork();
        directorResponsibilityService.allResponsibility(group);
        lead(group);
    }

    public void lead(Group group){
        System.out.println("Отвечает за работу команды.");
        System.out.println("Руководит командой.");
    }


}
