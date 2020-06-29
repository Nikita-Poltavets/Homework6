package com.homework.nix;

import com.homework.nix.data.Group;
import com.homework.nix.service.DirectorService;
import com.homework.nix.service.impl.DirectorServiceImlp;

public class Main {

    public static void main(String[] args) {
        DirectorService directorService = new DirectorServiceImlp();
        directorService.leadTheDevelopmentProcess(new Group());
    }
}
