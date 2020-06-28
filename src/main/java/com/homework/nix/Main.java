package com.homework.nix;

import com.homework.nix.data.Group;
import com.homework.nix.service.DirectorService;

public class Main {

    public static void main(String[] args) {
        DirectorService directorService = new DirectorService();
        directorService.leadTheDevelopmentProcess(new Group());
    }
}
