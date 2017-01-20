package com.mydoctor.appointments.configuration;

import com.mydoctor.appointments.persistance.commands.ArrangementCommand;
import com.mydoctor.appointments.persistance.commands.DoctorCommand;
import com.mydoctor.appointments.persistance.commands.PatientCommand;
import com.mydoctor.appointments.persistance.queries.ArrangementQuery;
import com.mydoctor.appointments.persistance.queries.DoctorQuery;
import com.mydoctor.appointments.persistance.queries.PatientQuery;
import com.mydoctor.appointments.service.ArrangementService;
import com.mydoctor.appointments.service.DoctorService;
import com.mydoctor.appointments.service.PatientService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

    @Bean
    public DoctorService doctorService(final DoctorCommand command, final DoctorQuery query){
        return new DoctorService(command, query);
    }

    @Bean
    public PatientService patientService(final PatientCommand command, final PatientQuery query){
        return new PatientService(command,query);
    }

    @Bean
    public ArrangementService arrangementService(final ArrangementCommand command, final ArrangementQuery query){
        return new ArrangementService(query,command);
    }
}
