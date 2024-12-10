package com.example.tu152.dto.mapper;

import com.example.tu152.db.entity.LocomotiveTechnicalStateLogEntity;
import com.example.tu152.dto.domain.LocomotiveTechnicalStateLog;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-10T22:35:37+0300",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.11.1.jar, environment: Java 17.0.13 (Amazon.com Inc.)"
)
@Component
public class LocomotiveTechnicalStateLogMapperImpl implements LocomotiveTechnicalStateLogMapper {

    @Override
    public LocomotiveTechnicalStateLog toDomain(LocomotiveTechnicalStateLogEntity journal) {
        if ( journal == null ) {
            return null;
        }

        LocomotiveTechnicalStateLog.LocomotiveTechnicalStateLogBuilder locomotiveTechnicalStateLog = LocomotiveTechnicalStateLog.builder();

        locomotiveTechnicalStateLog.id( journal.getId() );
        locomotiveTechnicalStateLog.date( journal.getDate() );
        locomotiveTechnicalStateLog.direction( journal.getDirection() );
        locomotiveTechnicalStateLog.train( journal.getTrain() );
        locomotiveTechnicalStateLog.weight( journal.getWeight() );
        locomotiveTechnicalStateLog.axles( journal.getAxles() );
        locomotiveTechnicalStateLog.acceptanceTime( journal.getAcceptanceTime() );
        locomotiveTechnicalStateLog.arrivalDriver( journal.getArrivalDriver() );
        locomotiveTechnicalStateLog.arrivalAssistant( journal.getArrivalAssistant() );
        locomotiveTechnicalStateLog.arrivalTime( journal.getArrivalTime() );
        locomotiveTechnicalStateLog.departureDriver( journal.getDepartureDriver() );
        locomotiveTechnicalStateLog.departureAssistant( journal.getDepartureAssistant() );
        locomotiveTechnicalStateLog.departureTime( journal.getDepartureTime() );
        locomotiveTechnicalStateLog.fuelOption( journal.getFuelOption() );
        locomotiveTechnicalStateLog.electricityReading( journal.getElectricityReading() );
        locomotiveTechnicalStateLog.fuelAmount( journal.getFuelAmount() );
        locomotiveTechnicalStateLog.comments( journal.getComments() );
        locomotiveTechnicalStateLog.signatureGiven( journal.getSignatureGiven() );
        locomotiveTechnicalStateLog.signatureReceived( journal.getSignatureReceived() );
        locomotiveTechnicalStateLog.repairDate( journal.getRepairDate() );
        locomotiveTechnicalStateLog.position( journal.getPosition() );
        locomotiveTechnicalStateLog.signature( journal.getSignature() );

        return locomotiveTechnicalStateLog.build();
    }

    @Override
    public List<LocomotiveTechnicalStateLog> toDomain(List<LocomotiveTechnicalStateLogEntity> journals) {
        if ( journals == null ) {
            return null;
        }

        List<LocomotiveTechnicalStateLog> list = new ArrayList<LocomotiveTechnicalStateLog>( journals.size() );
        for ( LocomotiveTechnicalStateLogEntity locomotiveTechnicalStateLogEntity : journals ) {
            list.add( toDomain( locomotiveTechnicalStateLogEntity ) );
        }

        return list;
    }

    @Override
    public LocomotiveTechnicalStateLogEntity toEntity(LocomotiveTechnicalStateLog journal) {
        if ( journal == null ) {
            return null;
        }

        LocomotiveTechnicalStateLogEntity.LocomotiveTechnicalStateLogEntityBuilder locomotiveTechnicalStateLogEntity = LocomotiveTechnicalStateLogEntity.builder();

        locomotiveTechnicalStateLogEntity.id( journal.getId() );
        locomotiveTechnicalStateLogEntity.date( journal.getDate() );
        locomotiveTechnicalStateLogEntity.direction( journal.getDirection() );
        locomotiveTechnicalStateLogEntity.train( journal.getTrain() );
        locomotiveTechnicalStateLogEntity.weight( journal.getWeight() );
        locomotiveTechnicalStateLogEntity.axles( journal.getAxles() );
        locomotiveTechnicalStateLogEntity.acceptanceTime( journal.getAcceptanceTime() );
        locomotiveTechnicalStateLogEntity.arrivalDriver( journal.getArrivalDriver() );
        locomotiveTechnicalStateLogEntity.arrivalAssistant( journal.getArrivalAssistant() );
        locomotiveTechnicalStateLogEntity.arrivalTime( journal.getArrivalTime() );
        locomotiveTechnicalStateLogEntity.departureDriver( journal.getDepartureDriver() );
        locomotiveTechnicalStateLogEntity.departureAssistant( journal.getDepartureAssistant() );
        locomotiveTechnicalStateLogEntity.departureTime( journal.getDepartureTime() );
        locomotiveTechnicalStateLogEntity.fuelOption( journal.getFuelOption() );
        locomotiveTechnicalStateLogEntity.electricityReading( journal.getElectricityReading() );
        locomotiveTechnicalStateLogEntity.fuelAmount( journal.getFuelAmount() );
        locomotiveTechnicalStateLogEntity.comments( journal.getComments() );
        locomotiveTechnicalStateLogEntity.signatureGiven( journal.getSignatureGiven() );
        locomotiveTechnicalStateLogEntity.signatureReceived( journal.getSignatureReceived() );
        locomotiveTechnicalStateLogEntity.repairDate( journal.getRepairDate() );
        locomotiveTechnicalStateLogEntity.position( journal.getPosition() );
        locomotiveTechnicalStateLogEntity.signature( journal.getSignature() );

        return locomotiveTechnicalStateLogEntity.build();
    }

    @Override
    public List<LocomotiveTechnicalStateLogEntity> toEntity(List<LocomotiveTechnicalStateLog> journals) {
        if ( journals == null ) {
            return null;
        }

        List<LocomotiveTechnicalStateLogEntity> list = new ArrayList<LocomotiveTechnicalStateLogEntity>( journals.size() );
        for ( LocomotiveTechnicalStateLog locomotiveTechnicalStateLog : journals ) {
            list.add( toEntity( locomotiveTechnicalStateLog ) );
        }

        return list;
    }
}
