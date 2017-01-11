package com.mydoctor.appointments.entities.converters;

import com.mydoctor.appointments.entities.enums.ArrangementType;

import javax.persistence.AttributeConverter;

public class ArrangementTypeConverter implements AttributeConverter<ArrangementType, Integer> {
    @Override
    public Integer convertToDatabaseColumn(ArrangementType requestType) {
        return requestType.getValue();
    }

    @Override
    public ArrangementType convertToEntityAttribute(Integer value) {
        return ArrangementType.of(value);
    }
}
