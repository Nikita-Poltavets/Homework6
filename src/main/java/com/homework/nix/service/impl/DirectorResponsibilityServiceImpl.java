package com.homework.nix.service.impl;

import com.homework.nix.data.Group;
import com.homework.nix.service.DirectorResponsibilityService;

public class DirectorResponsibilityServiceImpl implements DirectorResponsibilityService {

    @Override
    public void secondaryResponsibility(Group group){
        System.out.println("Помогает команде.");
        System.out.println("Мотивирует команду.");
        System.out.println("Отвечает на вопросы команды.");
    }

}
