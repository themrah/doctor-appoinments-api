package com.mydoctor.appointments.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by emrah.bektas on 09/05/16.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

    private Long id;
    private String username;
    private String password;
    private String email;
    private String msisdn;
    private String name;
    private String surName;
    private Integer status;
}
