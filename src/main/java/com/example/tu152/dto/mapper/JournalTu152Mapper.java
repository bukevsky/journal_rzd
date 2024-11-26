package com.example.tu152.dto.mapper;

import com.example.tu152.db.entity.JournalTu152Entity;
import com.example.tu152.dto.domain.JournalTu152;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface JournalTu152Mapper {
    JournalTu152 toDomain(JournalTu152Entity journal);
    List<JournalTu152> toDomain(List<JournalTu152Entity> journals);

    JournalTu152Entity toEntity(JournalTu152 journal);
    List<JournalTu152Entity> toEntity(List<JournalTu152> journals);
}
