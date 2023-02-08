package com.example.patterns._01_singleton;

public class SettingsSynchronized {

    private static SettingsSynchronized instance;

    private SettingsSynchronized() {}

    public static synchronized SettingsSynchronized getInstance() {
        if (instance == null) {
            instance = new SettingsSynchronized();
        }
        return instance;
    }
}
