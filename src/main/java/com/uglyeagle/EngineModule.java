package com.uglyeagle;

import dagger.Module;
import dagger.Provides;

@Module
public class EngineModule {
    @Provides
    Engine provideEngine() {
        return new DieselEngine();
    }
}