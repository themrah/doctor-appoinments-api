package com.mydoctor.appointments.model.util;

import com.mydoctor.appointments.entities.DoctorEntity;
import com.mydoctor.appointments.model.Doctor;
import com.mydoctor.appointments.model.request.DoctorRequest;
import com.mydoctor.appointments.model.response.DoctorResponse;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

public class DoctorBeanConvertionUtil {

    public static final Mapper mapper = new DozerBeanMapper();

    public static DoctorResponse convertToResponse(Doctor sourceObj){
        DoctorResponse response =
                mapper.map(sourceObj, DoctorResponse.class);
        return response;
    }

    public static Doctor convertFromRequest(DoctorRequest sourceObj){
        Doctor doctor =
                mapper.map(sourceObj, Doctor.class);
        return doctor;
    }

    public static DoctorEntity convertToEntity(Doctor sourceObj){
        DoctorEntity response =
                mapper.map(sourceObj, DoctorEntity.class);
        return response;
    }

    public static Doctor convertFromEntity(DoctorEntity sourceObj){
        Doctor response =
                mapper.map(sourceObj, Doctor.class);
        return response;
    }
}
