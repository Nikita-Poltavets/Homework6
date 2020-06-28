package com.homework.nix;

public class Director {

    private Vehicle vehicle = new Vehicle();
    private DirectorResponsibility directorResponsibility = new DirectorResponsibility();

    public void leadTheDevelopmentProcess(Group group){
        vehicle.isWork();
        directorResponsibility.allResponsibility(group);
        lead(group);
    }

    public void lead(Group group){
        System.out.println("Отвечает за работу команды.");
        System.out.println("Руководит командой.");
    }


}
