package com.mydoctor.appointments.entities;

import com.mydoctor.appointments.entities.converters.PatientStatusConverter;
import com.mydoctor.appointments.entities.enums.PatientStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity(name = "Patient")
@Table(schema = "MYDOCTOR", name = "Patient")
@SequenceGenerator(name = "PATIENT_SEQ", sequenceName = "MYDOCTOR.PATIENT_SEQ", allocationSize = 1)
public class PatientEntity {

    @Id
    @Column(nullable = false, name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PATIENT_SEQ")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "msisdn")
    private String msisdn;

    @Column(name = "name")
    private String name;

    @Column(name = "surName")
    private String surName;

    @Column(name = "status")
    @Convert(converter = PatientStatusConverter.class)
    private PatientStatus status;

    @Setter(AccessLevel.NONE)
    @CreatedDate
    private Date createdDate;

    @Setter(AccessLevel.NONE)
    @LastModifiedDate
    private Date lastModifiedDate;
}
