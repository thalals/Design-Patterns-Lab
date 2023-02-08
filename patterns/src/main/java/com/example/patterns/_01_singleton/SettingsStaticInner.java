package com.example.patterns._01_singleton;

import java.io.Serializable;

public class SettingsStaticInner implements Serializable {

    private static SettingsStaticInner instance;

    private SettingsStaticInner() {}

    private static class SettingHolder{

        private static final SettingsStaticInner SETTINGS = new SettingsStaticInner();
    }

    public static SettingsStaticInner getInstance() {
        return SettingHolder.SETTINGS;
    }

    private Object readResolve() {
        return SettingHolder.SETTINGS;
    }
}
