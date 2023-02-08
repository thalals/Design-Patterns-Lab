package com.example.patterns._01_singleton;

public class SettingsEagerInitialization {
    private static SettingsEagerInitialization instance = new SettingsEagerInitialization();

    private SettingsEagerInitialization() {}

    public static SettingsEagerInitialization getInstance() {
        return instance;
    }
}
