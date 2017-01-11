package com.mydoctor.appointments.configuration;

import com.mydoctor.appointments.persistance.commands.ArrangementCommand;
import com.mydoctor.appointments.persistance.commands.DoctorCommand;
import com.mydoctor.appointments.persistance.commands.PatientCommand;
import com.mydoctor.appointments.persistance.queries.ArrangementQuery;
import com.mydoctor.appointments.persistance.queries.DoctorQuery;
import com.mydoctor.appointments.persistance.queries.PatientQuery;
import com.mydoctor.appointments.repositories.ArrangementRepository;
import com.mydoctor.appointments.repositories.DoctorRepository;
import com.mydoctor.appointments.repositories.PatientRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class PersistanceConfiguration {

    @Bean
    public DoctorCommand doctorCommand(DoctorRepository doctorRepository){
        return new DoctorCommand(doctorRepository);
    }

    @Bean
    public DoctorQuery doctorQuery(DoctorRepository doctorRepository){
        return new DoctorQuery(doctorRepository);
    }

    @Bean
    public PatientCommand patientCommand(PatientRepository patientRepository){
        return new PatientCommand(patientRepository);
    }

    @Bean
    public PatientQuery patientQuery(PatientRepository patientRepository){
        return new PatientQuery(patientRepository);
    }

    @Bean
    public ArrangementCommand arrangementCommand(ArrangementRepository repository){
        return new ArrangementCommand(repository);
    }

    @Bean
    public ArrangementQuery arrangementQuery(ArrangementRepository repository){
        return new ArrangementQuery(repository);
    }
}
