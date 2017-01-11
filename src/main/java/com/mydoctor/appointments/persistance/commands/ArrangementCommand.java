package com.mydoctor.appointments.persistance.commands;

import com.mydoctor.appointments.entities.ArrangementEntity;
import com.mydoctor.appointments.repositories.ArrangementRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ArrangementCommand {

    private final ArrangementRepository arrangementRepository;

    public ArrangementEntity save(ArrangementEntity entity)
    {
        return arrangementRepository.save(entity);
    }

}
