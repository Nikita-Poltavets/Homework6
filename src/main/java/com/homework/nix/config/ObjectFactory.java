package com.homework.nix.config;

import com.homework.nix.config.impl.JavaApplicationConfiguration;

import java.lang.reflect.InvocationTargetException;

public class ObjectFactory {

    private static ObjectFactory instance;
    private ApplicationConfiguration config;

    private ObjectFactory(){
        config = new JavaApplicationConfiguration("com.homework.nix");
    }

    public static ObjectFactory getInstance() {
        if(instance == null){
            instance = new ObjectFactory();
        }
        return instance;
    }

    public <T> T createObject(Class<T> type){
        Class<? extends T> implClass = type;
        if (type.isInterface()) {
            implClass = config.getCurrentImplementation(type);
        }
        T t;
        try {
            t = implClass.getDeclaredConstructor().newInstance();

        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException("невозможно создать класс: " + e.getClass().getName() + " " + ",msg: " + e.getMessage());
        }
        return t;
    }
}
