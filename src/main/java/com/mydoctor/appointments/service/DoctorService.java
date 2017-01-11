package com.mydoctor.appointments.service;

import com.mydoctor.appointments.entities.DoctorEntity;
import com.mydoctor.appointments.entities.enums.DoctorStatus;
import com.mydoctor.appointments.model.Doctor;
import com.mydoctor.appointments.model.request.DoctorRequest;
import com.mydoctor.appointments.model.util.DoctorBeanConvertionUtil;
import com.mydoctor.appointments.persistance.commands.DoctorCommand;
import com.mydoctor.appointments.persistance.queries.DoctorQuery;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DoctorService {

    private final DoctorCommand doctorCommand;
    private final DoctorQuery doctorQuery;

    public Long create(DoctorRequest request){
        DoctorEntity entity = new DoctorEntity();
        entity.setEmail(request.getEmail());
        entity.setMsisdn(request.getMsisdn());
        entity.setName(request.getName());
        entity.setPassword(request.getPassword());
        entity.setSurName(request.getSurName());
        entity.setUsername(request.getUsername());
        entity.setStatus(DoctorStatus.ACTIVE);
        return doctorCommand.save(entity);
    }

    public Doctor get(Long id) {
        return doctorQuery.get(id);
    }

    public Long update(Doctor doctor){
        DoctorEntity entity = DoctorBeanConvertionUtil.convertToEntity(doctor);
        return doctorCommand.save(entity);

    }
}
