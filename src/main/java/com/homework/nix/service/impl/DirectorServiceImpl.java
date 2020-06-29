package com.homework.nix.service.impl;

import com.homework.nix.config.ObjectFactory;
import com.homework.nix.data.Group;
import com.homework.nix.service.DirectorResponsibilityService;
import com.homework.nix.service.DirectorService;
import com.homework.nix.service.VehicleService;

public class DirectorServiceImlp implements DirectorService<Group> {

    private VehicleService vehicleService = ObjectFactory.getInstance().createObject(VehicleService.class);
    private DirectorResponsibilityService directorResponsibilityService = ObjectFactory.getInstance().createObject(DirectorResponsibilityService.class);

    @Override
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
