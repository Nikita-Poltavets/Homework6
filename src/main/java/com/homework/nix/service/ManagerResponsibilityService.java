package com.homework.nix.service;

import com.homework.nix.data.abstr.Employee;

public interface ManagerResponsibilityService<E extends Employee> {

    void secondaryResponsibility(E e);
}
