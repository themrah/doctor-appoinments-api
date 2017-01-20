package com.mydoctor.appointments.persistance.commands;

import com.mydoctor.appointments.entities.DoctorEntity;
import com.mydoctor.appointments.repositories.DoctorRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DoctorCommand {

    private final DoctorRepository doctorRepository;

    public Long save(DoctorEntity entity){
        entity = doctorRepository.save(entity);
        return entity.getId();
    }
}
