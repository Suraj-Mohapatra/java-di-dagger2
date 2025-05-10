package com.uglyeagle;

import dagger.Component;

@Component(modules = EngineModule.class)
public interface CarComponent {
    Car buildCar();
}