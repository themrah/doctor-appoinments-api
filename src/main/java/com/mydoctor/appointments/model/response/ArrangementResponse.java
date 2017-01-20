package com.mydoctor.appointments.model.response;

import com.mydoctor.appointments.entities.enums.ArrangementStatus;
import com.mydoctor.appointments.entities.enums.ArrangementType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ArrangementResponse {
    private Long id;
    private Long doctorId;
    private Long patientId;
    private ArrangementStatus status;
    private ArrangementType type;
    private Date arrangementDate;
    private Date createdDate;
    private Date lastModifiedDate;
}
