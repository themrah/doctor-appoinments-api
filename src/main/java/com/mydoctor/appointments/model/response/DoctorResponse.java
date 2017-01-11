package com.mydoctor.appointments.model.response;

import com.mydoctor.appointments.entities.enums.DoctorStatus;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoctorResponse {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String msisdn;
    private String name;
    private String surName;
    private DoctorStatus status;
}
