package com.mydoctor.appointments.entities.enums;

import lombok.Getter;

/**
 * Created by emrah.bektas on 27/04/16.
 */
@Getter
public enum ArrangementType {

    MEETING(0), PAYMENT(1);

    private final int type;

    ArrangementType(int type) {
        this.type = type;
    }

    public static ArrangementType of(int type) {
        for (ArrangementType reqType : ArrangementType.values()) {
            if (type == reqType.type) {
                return reqType;
            }
        }
        throw new IllegalArgumentException("Unknown enum value " + type);
    }

    public int getValue(){
        return this.type;
    }
}
