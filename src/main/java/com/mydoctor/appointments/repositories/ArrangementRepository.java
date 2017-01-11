package com.mydoctor.appointments.repositories;

import com.mydoctor.appointments.entities.ArrangementEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArrangementRepository extends JpaRepository<ArrangementEntity, Long> {
}
