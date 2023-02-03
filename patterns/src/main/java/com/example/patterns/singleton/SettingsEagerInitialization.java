package com.example.patterns.singleton;

public class SettingsEagerInitialization {
    private static SettingsEagerInitialization instance = new SettingsEagerInitialization();

    private SettingsEagerInitialization() {}

    public static SettingsEagerInitialization getInstance() {
        return instance;
    }
}
