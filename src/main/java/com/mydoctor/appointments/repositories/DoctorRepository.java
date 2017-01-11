package com.mydoctor.appointments.repositories;

import com.mydoctor.appointments.entities.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> {

}
