package com.mydoctor.appointments.entities;

import com.mydoctor.appointments.entities.converters.ArrangementStatusConverter;
import com.mydoctor.appointments.entities.converters.ArrangementTypeConverter;
import com.mydoctor.appointments.entities.enums.ArrangementStatus;
import com.mydoctor.appointments.entities.enums.ArrangementType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity(name = "Arrangement")
@Table(schema = "MYDOCTOR", name = "ARRANGEMENT")
@SequenceGenerator(name = "ARRANGEMENT_SEQ", sequenceName = "MYDOCTOR.ARRANGEMENT_SEQ", allocationSize = 1)
public class ArrangementEntity {
    @Id
    @Column(nullable = false, name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARRANGEMENT_SEQ")
    private Long id;

    @Column(name = "doctorId", nullable = false)
    private Long doctorId;

    @Column(name = "patientId", nullable = false)
    private Long patientId;

    @Column(name = "type", nullable = false)
    @Convert(converter = ArrangementTypeConverter.class)
    private ArrangementType type;

    @Column(name = "status")
    @Convert(converter = ArrangementStatusConverter.class)
    private ArrangementStatus status;

    @Column(name = "arrangementDate")
    private Date arrangementDate;

    @Setter(AccessLevel.NONE)
    @CreatedDate
    private Date createdDate;

    @Setter(AccessLevel.NONE)
    @LastModifiedDate
    private Date lastModifiedDate;
}
