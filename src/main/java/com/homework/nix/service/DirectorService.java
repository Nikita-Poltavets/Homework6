package com.homework.nix.service;

import com.homework.nix.data.Group;
import com.homework.nix.service.impl.DirectorResponsibilityServiceImpl;
import com.homework.nix.service.impl.VehicleServiceImpl;

public class DirectorService {

    private VehicleService vehicleService = new VehicleServiceImpl();
    private DirectorResponsibilityService directorResponsibilityService = new DirectorResponsibilityServiceImpl();

    public void leadTheDevelopmentProcess(Group group){
        vehicleService.isWork();
        directorResponsibilityService.secondaryResponsibility(group);
        lead(group);
    }

    public void lead(Group group){
        System.out.println("Отвечает за работу команды.");
        System.out.println("Руководит командой.");
    }


}
