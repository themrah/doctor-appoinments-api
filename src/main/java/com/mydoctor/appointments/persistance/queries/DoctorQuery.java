package com.mydoctor.appointments.persistance.queries;

import com.mydoctor.appointments.entities.DoctorEntity;
import com.mydoctor.appointments.model.Doctor;
import com.mydoctor.appointments.repositories.DoctorRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DoctorQuery {

    private final DoctorRepository doctorRepository;

    public Doctor get(Long id) {
        DoctorEntity entity = doctorRepository.getOne(id);
        if (entity == null)
            return null;

        Doctor doctor = new Doctor();
        doctor.setEmail(entity.getEmail());
        doctor.setPassword(entity.getPassword());
        doctor.setName(entity.getName());
        doctor.setUsername(entity.getUsername());
        doctor.setSurName(entity.getSurName());
        doctor.setMsisdn(entity.getMsisdn());
        doctor.setId(entity.getId());
        doctor.setStatus(entity.getStatus());
        return doctor;
    }
}
