package com.mydoctor.appointments.model.util;


import com.mydoctor.appointments.entities.ArrangementEntity;
import com.mydoctor.appointments.model.Arrangement;
import com.mydoctor.appointments.model.request.ArrangementRequest;
import com.mydoctor.appointments.model.response.ArrangementResponse;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

public class ArrangementBeanConvertionUtil {

    public static final Mapper mapper = new DozerBeanMapper();

    public static ArrangementResponse convertToResponse(Arrangement sourceObj){
        ArrangementResponse response =
                mapper.map(sourceObj, ArrangementResponse.class);
        return response;
    }

    public static Arrangement convertFromRequest(ArrangementRequest sourceObj){
        Arrangement arrangement =
                mapper.map(sourceObj, Arrangement.class);
        return arrangement;
    }

    public static ArrangementEntity convertToEntity(Arrangement sourceObj){
        ArrangementEntity response =
                mapper.map(sourceObj, ArrangementEntity.class);
        return response;
    }

    public static Arrangement convertFromEntity(ArrangementEntity sourceObj){
        Arrangement response =
                mapper.map(sourceObj, Arrangement.class);
        return response;
    }
}
