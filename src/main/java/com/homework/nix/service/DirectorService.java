package com.homework.nix.service;

import com.homework.nix.data.abstr.Employee;

public interface DirectorService<E extends Employee> {

    void leadTheDevelopmentProcess(E e);

}
