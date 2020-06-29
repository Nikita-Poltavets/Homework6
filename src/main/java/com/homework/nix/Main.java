package com.homework.nix;

import com.homework.nix.data.Group;
import com.homework.nix.service.DirectorService;
import com.homework.nix.service.impl.DirectorServiceImpl;

public class Main {

    public static void main(String[] args) {
        DirectorService directorService = new DirectorServiceImpl();
        directorService.leadTheDevelopmentProcess(new Group());
    }
}
