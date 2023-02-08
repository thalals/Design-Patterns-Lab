package com.example.patterns._01_singleton;

public class SettingsDoubleCheckSynchronized {

    private static SettingsDoubleCheckSynchronized instance;

    private SettingsDoubleCheckSynchronized() {}

    public static SettingsDoubleCheckSynchronized getInstance() {
        if (instance == null) {
            synchronized (SettingsDoubleCheckSynchronized.class) {
                if (instance == null) {
                    instance = new SettingsDoubleCheckSynchronized();
                }
            }
        }
        return instance;
    }
}
