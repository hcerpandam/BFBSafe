package com.integration.time.record.api;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TimeRecordRepository extends JpaRepository<TimeRecord, String> {

    void deleteByRecordDateBefore(LocalDate date);

    List<TimeRecord> findTop50000ByStatusOrderByRecordDateAsc(String status);
}
