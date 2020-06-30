package com.homework.nix.service.impl;

import com.homework.nix.annotation.Value;
import com.homework.nix.service.WorkStuffService;

public class WorkStuffServiceImpl implements WorkStuffService {

    @Value
    private String briefcase;

    @Override
    public void check() {
        System.out.println(briefcase + "имеется");
    }
}
