package com.mydoctor.appointments.entities;

import com.mydoctor.appointments.entities.converters.DoctorStatusConverter;
import com.mydoctor.appointments.entities.enums.DoctorStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity(name = "Doctor")
@Table(schema = "MYDOCTOR", name = "DOCTOR")
@SequenceGenerator(name = "MYDOCTOR_SEQ", sequenceName = "MYDOCTOR.MYDOCTOR_SEQ", allocationSize = 1)
public class DoctorEntity {

    @Id
    @Column(nullable = false, name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MYDOCTOR_SEQ")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    //@Pattern(regexp = ".+@.+\\\\..+",message = "invalid email format")
    private String email;

    @Column(name = "msisdn")
    private String msisdn;
    @Column(name = "name")

    private String name;

    @Column(name = "surName")
    private String surName;

    @Column(name = "status")
    @Convert(converter = DoctorStatusConverter.class)
    private DoctorStatus status;

    @Setter(AccessLevel.NONE)
    @CreatedDate
    private Date createdDate;

    @Setter(AccessLevel.NONE)
    @LastModifiedDate
    private Date lastModifiedDate;
}
