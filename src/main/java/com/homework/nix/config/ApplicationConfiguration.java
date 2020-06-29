package com.homework.nix.config;

public interface ApplicationConfiguration {

    <T> Class<? extends T> getCurrentImplementation(Class<T> type);
}
