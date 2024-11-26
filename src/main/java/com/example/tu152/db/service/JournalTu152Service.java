package com.example.tu152.db.service;

import com.example.tu152.db.repository.JournalTu152Repository;
import com.example.tu152.dto.domain.JournalTu152;
import com.example.tu152.dto.mapper.JournalTu152Mapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class JournalTu152Service {
    private final JournalTu152Repository journalRepository;
    private final JournalTu152Mapper journalMapper;

    @Transactional
    public JournalTu152 upsert(JournalTu152 journal){
        return journalMapper.toDomain(journalRepository.save(journalMapper.toEntity(journal)));
    }
    @Transactional
    public void delete(Long id){
        journalRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public JournalTu152 getJournalById(Long id){
        return journalMapper.toDomain(journalRepository.findById(id).orElse(null));
    }

    @Transactional(readOnly = true)
    public List<JournalTu152> getJournals() {
        return journalMapper.toDomain(journalRepository.findAll());
    }
}
