package com.mydoctor.appointments.model.request;


import com.mydoctor.appointments.entities.enums.DoctorStatus;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoctorRequest {
    private String username;
    private String password;
    private String email;
    private String msisdn;
    private String name;
    private String surName;
    private DoctorStatus status;
}
