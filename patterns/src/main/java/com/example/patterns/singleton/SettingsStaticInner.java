package com.example.patterns.singleton;

public class SettingsStaticInner {
    private static SettingsStaticInner instance;

    private SettingsStaticInner() {}

    private static class SettingHolder{

        private static final SettingsStaticInner SETTINGS = new SettingsStaticInner();
    }

    public static SettingsStaticInner getInstance() {
        return SettingHolder.SETTINGS;
    }
}
