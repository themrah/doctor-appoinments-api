package com.mydoctor.appointments.service;

import com.mydoctor.appointments.entities.ArrangementEntity;
import com.mydoctor.appointments.entities.enums.ArrangementStatus;
import com.mydoctor.appointments.model.Arrangement;
import com.mydoctor.appointments.model.request.ArrangementRequest;
import com.mydoctor.appointments.model.util.ArrangementBeanConvertionUtil;
import com.mydoctor.appointments.persistance.commands.ArrangementCommand;
import com.mydoctor.appointments.persistance.queries.ArrangementQuery;
import lombok.RequiredArgsConstructor;

import java.text.SimpleDateFormat;

@RequiredArgsConstructor
public class ArrangementService {
    private final ArrangementQuery arrangementQuery;
    private final ArrangementCommand arrangementCommand;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public Long create(ArrangementRequest request) throws Exception {
        ArrangementEntity entity = new ArrangementEntity();
        entity.setDoctorId(request.getDoctorId());
        entity.setPatientId(request.getPatientId());
        entity.setType(request.getType());
        entity.setArrangementDate(sdf.parse(request.getArrangementDate()));
        entity.setStatus(ArrangementStatus.INITIAL);
        entity = arrangementCommand.save(entity);
        return entity.getId();
    }

    public Arrangement get(Long id) {
        ArrangementEntity entity = arrangementQuery.get(id);
        return ArrangementBeanConvertionUtil.convertFromEntity(entity);
    }

    public Long update(Arrangement arrangement) {
        ArrangementEntity entity = ArrangementBeanConvertionUtil.convertToEntity(arrangement);
        entity =  arrangementCommand.save(entity);
        return entity.getId();
    }
}
