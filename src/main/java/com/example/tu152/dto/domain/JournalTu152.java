package com.example.tu152.dto.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class JournalTu152 {
    private Long id;
    private Date date;
    private String direction;
    private String train;
    private Float weight;
    private String axles;
    private Integer receptionStartTime;
    private String incomingDriverName;
    private String incomingDriverAssistantName;
    private Integer handoverTime;
    private String outgoingDriverName;
    private String outgoingDriverAssistantName;
    private Integer acceptanceTime;
    private Float fuelAmount;
    private String remarksDefects;
    private Boolean handoverSignature;
    private Boolean acceptanceSignature;
    private Date defectCorrectionDate;
    private String position;
    private Boolean finalSignature;
}