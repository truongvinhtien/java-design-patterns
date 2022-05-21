package com.tvt.singleton;

import java.util.Objects;

public class SingletonClass {
    private SingletonClass singletonClass;

    private SingletonClass () {

    }

    public SingletonClass getSingletonClass() {
        if (Objects.isNull(singletonClass)) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }
}
