package com.example.patterns.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SettingsPrivateStaticTest {

    @Test
    void test() {
        SettingsPrivateStatic settings = SettingsPrivateStatic.getInstance();
        SettingsPrivateStatic settings1 = SettingsPrivateStatic.getInstance();

        assertThat(settings).isEqualTo(settings1);
    }
}