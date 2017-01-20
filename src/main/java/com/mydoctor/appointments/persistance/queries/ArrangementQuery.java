package com.mydoctor.appointments.persistance.queries;

import com.mydoctor.appointments.entities.ArrangementEntity;
import com.mydoctor.appointments.repositories.ArrangementRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ArrangementQuery {

    private final ArrangementRepository arrangementRepository;

    public ArrangementEntity get(Long id) {
        return arrangementRepository.findOne(id);
    }
}
