package com.mydoctor.appointments.repositories;

import com.mydoctor.appointments.entities.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientEntity, Long> {

}
