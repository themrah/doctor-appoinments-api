package com.mydoctor.appointments.entities.converters;

import com.mydoctor.appointments.entities.enums.PatientStatus;

import javax.persistence.AttributeConverter;


public class PatientStatusConverter implements AttributeConverter<PatientStatus, Integer> {
    @Override
    public Integer convertToDatabaseColumn(PatientStatus requestStatus) {
        return requestStatus.getValue();
    }

    @Override
    public PatientStatus convertToEntityAttribute(Integer integer) {
        return PatientStatus.of(integer);
    }
}