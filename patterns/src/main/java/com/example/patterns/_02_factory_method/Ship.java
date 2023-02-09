package com.example.patterns._02_factory_method;

import com.example.patterns._03_abstract_factory.AnChore;
import com.example.patterns._03_abstract_factory.Wheel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Ship {

    private String name;
    private String email;
    private String logo;

    //부품 (03 추상 팩토리)
    private AnChore anchor;
    private Wheel wheel;

    public void setAnchor(AnChore anchor) {
        this.anchor = anchor;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
