package com.example.tu152.db.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "JournalTu152")
public class JournalTu152Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private Date date;

    @Column(name = "direction")
    private String direction;

    @Column(name = "train")
    private String train;

    @Column(name = "weight")
    private Float weight;

    @Column(name = "axles")
    private String axles;

    @Column(name = "reception_start_time")
    private Integer receptionStartTime;

    @Column(name = "incoming_driver_name")
    private String incomingDriverName;

    @Column(name = "incoming_driver_assistant_name")
    private String incomingDriverAssistantName;

    @Column(name = "handover_time")
    private Integer handoverTime;

    @Column(name = "outgoing_driver_name")
    private String outgoingDriverName;

    @Column(name = "outgoing_driver_assistant_name")
    private String outgoingDriverAssistantName;

    @Column(name = "acceptance_time")
    private Integer acceptanceTime;

    @Column(name = "fuel_amount")
    private Float fuelAmount;

    @Column(name = "remarks_defects")
    private String remarksDefects;

    @Column(name = "handover_signature")
    private Boolean handoverSignature;

    @Column(name = "acceptance_signature")
    private Boolean acceptanceSignature;

    @Column(name = "defect_correction_date")
    private Date defectCorrectionDate;

    @Column(name = "position")
    private String position;

    @Column(name = "final_signature")
    private Boolean finalSignature;
}