package com.homework.nix.service;

import com.homework.nix.data.Group;

public class DirectorService {

    private VehicleService vehicleService = new VehicleService();
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
