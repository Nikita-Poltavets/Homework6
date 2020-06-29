package com.homework.nix;

import com.homework.nix.data.Group;
import com.homework.nix.service.impl.DirectorServiceImlp;

public class Main {

    public static void main(String[] args) {
        DirectorServiceImlp directorServiceImlp = new DirectorServiceImlp();
        directorServiceImlp.leadTheDevelopmentProcess(new Group());
    }
}
