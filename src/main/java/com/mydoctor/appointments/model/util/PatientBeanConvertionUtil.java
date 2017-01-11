package com.mydoctor.appointments.model.util;

import com.mydoctor.appointments.entities.PatientEntity;
import com.mydoctor.appointments.model.Patient;
import com.mydoctor.appointments.model.request.PatientRequest;
import com.mydoctor.appointments.model.response.PatientResponse;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

public class PatientBeanConvertionUtil {

    public static final Mapper mapper = new DozerBeanMapper();

    public static PatientResponse convertToResponse(Patient sourceObj){
        PatientResponse response =
                mapper.map(sourceObj, PatientResponse.class);
        return response;
    }

    public static Patient convertFromRequest(PatientRequest sourceObj){
        Patient patient =
                mapper.map(sourceObj, Patient.class);
        return patient;
    }

    public static PatientEntity convertToEntity(Patient sourceObj){
        PatientEntity response =
                mapper.map(sourceObj, PatientEntity.class);
        return response;
    }

    public static Patient convertFromEntity(PatientEntity sourceObj){
        Patient response =
                mapper.map(sourceObj, Patient.class);
        return response;
    }
}
