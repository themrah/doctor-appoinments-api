package com.mydoctor.appointments.entities.converters;

import com.mydoctor.appointments.entities.enums.ArrangementStatus;

import javax.persistence.AttributeConverter;

/**
 * Created by emrah.bektas on 27/04/16.
 */
public class ArrangementStatusConverter implements AttributeConverter<ArrangementStatus, Integer>{
    @Override
    public Integer convertToDatabaseColumn(ArrangementStatus requestStatus) {
        return requestStatus.getValue();
    }

    @Override
    public ArrangementStatus convertToEntityAttribute(Integer integer) {
        return ArrangementStatus.of(integer);
    }
}
