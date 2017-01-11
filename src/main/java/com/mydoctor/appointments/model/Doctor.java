package com.mydoctor.appointments.model;

import com.mydoctor.appointments.entities.enums.DoctorStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Doctor {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String msisdn;
    private String name;
    private String surName;
    private DoctorStatus status;
}

