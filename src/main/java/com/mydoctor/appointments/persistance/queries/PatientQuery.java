package com.mydoctor.appointments.persistance.queries;

import com.mydoctor.appointments.entities.PatientEntity;
import com.mydoctor.appointments.repositories.PatientRepository;
import lombok.RequiredArgsConstructor;

/**
 * Created by emrah.bektas on 09/05/16.
 */
@RequiredArgsConstructor
public class PatientQuery {

    private final PatientRepository repository;

    public PatientEntity get(Long id) {
        return repository.findOne(id);
    }
}
