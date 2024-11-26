package com.example.tu152.controller;

import com.example.tu152.db.service.JournalTu152Service;
import com.example.tu152.dto.domain.JournalTu152;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api/v1")
@RequiredArgsConstructor
public class JournalTu152Controller {
    private final JournalTu152Service journalTu152Service;

    @PostMapping("/journalTu152")
    public ResponseEntity<JournalTu152> upsert(@RequestBody JournalTu152 journal){
        return ResponseEntity.ok(journalTu152Service.upsert(journal));
    }

    @PostMapping("/journalTu152/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
        journalTu152Service.delete(id);
        return ResponseEntity.ok("Журнал успешно удален");
    }

    @GetMapping("/journalTu152/{id}")
    public ResponseEntity<JournalTu152> getJournalById(@PathVariable Long id) {
        return ResponseEntity.ok(journalTu152Service.getJournalById(id));
    }

    @GetMapping("/journalTu152")
    public ResponseEntity<List<JournalTu152>> getJournals() {
        return ResponseEntity.ok(journalTu152Service.getJournals());
    }
}
