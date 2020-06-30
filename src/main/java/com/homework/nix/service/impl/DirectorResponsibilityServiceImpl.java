package com.homework.nix.service.impl;

import com.homework.nix.config.ObjectFactory;
import com.homework.nix.data.Group;
import com.homework.nix.service.DirectorResponsibilityService;
import com.homework.nix.service.WorkStuffService;

public class DirectorResponsibilityServiceImpl implements DirectorResponsibilityService {

    private WorkStuffService workStuffService = ObjectFactory.getInstance().createObject(WorkStuffService.class);

    @Override
    public void secondaryResponsibility(Group group){
        workStuffService.check();
        System.out.println("Помогает команде.");
        System.out.println("Мотивирует команду.");
        System.out.println("Отвечает на вопросы команды.");
    }

}
