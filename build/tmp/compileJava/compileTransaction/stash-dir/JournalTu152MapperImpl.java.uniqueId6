package com.example.tu152.dto.mapper;

import com.example.tu152.db.entity.JournalTu152Entity;
import com.example.tu152.dto.domain.JournalTu152;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-24T22:34:48+0300",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.11.1.jar, environment: Java 17.0.13 (Amazon.com Inc.)"
)
@Component
public class JournalTu152MapperImpl implements JournalTu152Mapper {

    @Override
    public JournalTu152 toDomain(JournalTu152Entity journal) {
        if ( journal == null ) {
            return null;
        }

        JournalTu152.JournalTu152Builder journalTu152 = JournalTu152.builder();

        journalTu152.id( journal.getId() );
        journalTu152.date( journal.getDate() );
        journalTu152.direction( journal.getDirection() );
        journalTu152.train( journal.getTrain() );
        journalTu152.weight( journal.getWeight() );
        journalTu152.axles( journal.getAxles() );
        journalTu152.receptionStartTime( journal.getReceptionStartTime() );
        journalTu152.incomingDriverName( journal.getIncomingDriverName() );
        journalTu152.incomingDriverAssistantName( journal.getIncomingDriverAssistantName() );
        journalTu152.handoverTime( journal.getHandoverTime() );
        journalTu152.outgoingDriverName( journal.getOutgoingDriverName() );
        journalTu152.outgoingDriverAssistantName( journal.getOutgoingDriverAssistantName() );
        journalTu152.acceptanceTime( journal.getAcceptanceTime() );
        journalTu152.fuelAmount( journal.getFuelAmount() );
        journalTu152.remarksDefects( journal.getRemarksDefects() );
        journalTu152.handoverSignature( journal.getHandoverSignature() );
        journalTu152.acceptanceSignature( journal.getAcceptanceSignature() );
        journalTu152.defectCorrectionDate( journal.getDefectCorrectionDate() );
        journalTu152.position( journal.getPosition() );
        journalTu152.finalSignature( journal.getFinalSignature() );

        return journalTu152.build();
    }

    @Override
    public List<JournalTu152> toDomain(List<JournalTu152Entity> journals) {
        if ( journals == null ) {
            return null;
        }

        List<JournalTu152> list = new ArrayList<JournalTu152>( journals.size() );
        for ( JournalTu152Entity journalTu152Entity : journals ) {
            list.add( toDomain( journalTu152Entity ) );
        }

        return list;
    }

    @Override
    public JournalTu152Entity toEntity(JournalTu152 journal) {
        if ( journal == null ) {
            return null;
        }

        JournalTu152Entity.JournalTu152EntityBuilder journalTu152Entity = JournalTu152Entity.builder();

        journalTu152Entity.id( journal.getId() );
        journalTu152Entity.date( journal.getDate() );
        journalTu152Entity.direction( journal.getDirection() );
        journalTu152Entity.train( journal.getTrain() );
        journalTu152Entity.weight( journal.getWeight() );
        journalTu152Entity.axles( journal.getAxles() );
        journalTu152Entity.receptionStartTime( journal.getReceptionStartTime() );
        journalTu152Entity.incomingDriverName( journal.getIncomingDriverName() );
        journalTu152Entity.incomingDriverAssistantName( journal.getIncomingDriverAssistantName() );
        journalTu152Entity.handoverTime( journal.getHandoverTime() );
        journalTu152Entity.outgoingDriverName( journal.getOutgoingDriverName() );
        journalTu152Entity.outgoingDriverAssistantName( journal.getOutgoingDriverAssistantName() );
        journalTu152Entity.acceptanceTime( journal.getAcceptanceTime() );
        journalTu152Entity.fuelAmount( journal.getFuelAmount() );
        journalTu152Entity.remarksDefects( journal.getRemarksDefects() );
        journalTu152Entity.handoverSignature( journal.getHandoverSignature() );
        journalTu152Entity.acceptanceSignature( journal.getAcceptanceSignature() );
        journalTu152Entity.defectCorrectionDate( journal.getDefectCorrectionDate() );
        journalTu152Entity.position( journal.getPosition() );
        journalTu152Entity.finalSignature( journal.getFinalSignature() );

        return journalTu152Entity.build();
    }

    @Override
    public List<JournalTu152Entity> toEntity(List<JournalTu152> journals) {
        if ( journals == null ) {
            return null;
        }

        List<JournalTu152Entity> list = new ArrayList<JournalTu152Entity>( journals.size() );
        for ( JournalTu152 journalTu152 : journals ) {
            list.add( toEntity( journalTu152 ) );
        }

        return list;
    }
}
