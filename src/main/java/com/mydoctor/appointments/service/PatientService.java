package com.mydoctor.appointments.service;

import com.mydoctor.appointments.entities.PatientEntity;
import com.mydoctor.appointments.entities.enums.PatientStatus;
import com.mydoctor.appointments.model.Patient;
import com.mydoctor.appointments.model.request.PatientRequest;
import com.mydoctor.appointments.model.util.PatientBeanConvertionUtil;
import com.mydoctor.appointments.persistance.commands.PatientCommand;
import com.mydoctor.appointments.persistance.queries.PatientQuery;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PatientService {
    private final PatientCommand command;
    private final PatientQuery query;


    public Long create(PatientRequest request) {
        PatientEntity entity = new PatientEntity();
        entity.setEmail(request.getEmail());
        entity.setName(request.getName());
        entity.setSurName(request.getSurName());
        entity.setMsisdn(request.getMsisdn());
        entity.setUsername(request.getUsername());
        entity.setPassword(request.getPassword());
        entity.setStatus(PatientStatus.ACTIVE);
        return command.save(entity);
    }

    public Patient get(Long id) {
        PatientEntity entity = query.get(id);
        return PatientBeanConvertionUtil.convertFromEntity(entity);
    }

    public Long update(Patient patient) {
        PatientEntity entity = PatientBeanConvertionUtil.convertToEntity(patient);
        return command.save(entity);
    }
}
