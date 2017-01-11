package com.mydoctor.appointments.persistance.commands;

import com.mydoctor.appointments.entities.PatientEntity;
import com.mydoctor.appointments.repositories.PatientRepository;
import lombok.RequiredArgsConstructor;

/**
 * Created by emrah.bektas on 09/05/16.
 */
@RequiredArgsConstructor
public class PatientCommand {

    private final PatientRepository repository;

    public Long save(PatientEntity entity) {
        entity = repository.save(entity);
        return entity.getId();
    }
}
