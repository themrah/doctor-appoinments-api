package com.mydoctor.appointments.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PatientRequest {

    private String username;

    private String password;

    private String email;

    private String msisdn;

    private String name;

    private String surName;

    private Integer status;
}
