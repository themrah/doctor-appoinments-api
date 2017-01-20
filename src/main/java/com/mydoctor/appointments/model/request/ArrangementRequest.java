package com.mydoctor.appointments.model.request;

import com.mydoctor.appointments.entities.enums.ArrangementStatus;
import com.mydoctor.appointments.entities.enums.ArrangementType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ArrangementRequest {
    private Long doctorId;
    private Long patientId;
    private ArrangementType type;
    private ArrangementStatus status;
    private String arrangementDate;
}
