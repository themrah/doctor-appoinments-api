package com.mydoctor.appointments.entities.converters;

import com.mydoctor.appointments.entities.enums.DoctorStatus;

import javax.persistence.AttributeConverter;

public class DoctorStatusConverter implements AttributeConverter<DoctorStatus, Integer> {
    @Override
    public Integer convertToDatabaseColumn(DoctorStatus requestStatus) {
        return requestStatus.getValue();
    }

    @Override
    public DoctorStatus convertToEntityAttribute(Integer integer) {
        return DoctorStatus.of(integer);
    }
}