package com.mydoctor.appointments.model.response;

import com.mydoctor.appointments.entities.enums.PatientStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientResponse {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String msisdn;
    private String name;
    private String surName;
    private PatientStatus status;
}
