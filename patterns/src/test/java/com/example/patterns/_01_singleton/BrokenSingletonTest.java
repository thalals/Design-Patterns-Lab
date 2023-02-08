package com.example.patterns._01_singleton;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BrokenSingletonTest {

    @Test
    @DisplayName("리플렉션을 사용해서 Singleton 깨드리기")
    void reflection() throws Exception {

        SettingsStaticInner setting = SettingsStaticInner.getInstance();

        Constructor<SettingsStaticInner> declaredConstructor = SettingsStaticInner.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);

        SettingsStaticInner setting1 = declaredConstructor.newInstance();

        assertThat(setting).isEqualTo(setting1);
    }

    @Test
    @DisplayName("직렬화 후 역직렬화로 singleton 깨뜨리기")
    void serializerAndDeSerializer() throws IOException, ClassNotFoundException {
        SettingsStaticInner setting = SettingsStaticInner.getInstance();
        SettingsStaticInner setting1 = null;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(setting);
        }

        try (ObjectInput input = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            setting1 = (SettingsStaticInner) input.readObject();
        }

        assertThat(setting).isEqualTo(setting1);
    }
}
