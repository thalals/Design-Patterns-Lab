package com.example.patterns._01_singleton;

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
