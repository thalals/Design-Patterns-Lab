package com.example.patterns._11_flyweight._02_after;

import java.util.HashMap;
import java.util.Map;

/**
 *  flyweight factory
 *
 *  flyweight 갹체를 캐싱해서 가져오는 역할
 */
public class FontFactory {

    Map<String, Font> cache = new HashMap<>();

    public Font getFont(String font) {
        if (cache.containsKey(font)) {
            return cache.get(font);
        }

        String split[] = font.split(":");
        Font newFont = new Font(split[0], Integer.parseInt(split[1]));

        cache.put(font, newFont);
        return newFont;
    }
}
