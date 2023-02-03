package com.example.patterns.singleton;

public class SettingsPrivateStatic {
    private static SettingsPrivateStatic instance;

    private SettingsPrivateStatic() {}

    public static SettingsPrivateStatic getInstance() {
        if(instance == null){
            instance = new SettingsPrivateStatic();
        }
        return instance;
    }
}
