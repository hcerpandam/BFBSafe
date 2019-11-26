package com.integration.time.record.api;

import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@RestController
@Transactional
public class TimeRecordController {

    private final TimeRecordRepository timeRecordRepository;

    public TimeRecordController(TimeRecordRepository timeRecordRepository) {
        this.timeRecordRepository = timeRecordRepository;
    }


    //SELECT * FROM TimeRecordControl__c WHERE Status__c = 'Contencioso por inacción' ORDER BY RecordDate__c LIMIT 50000
    @GetMapping("/contencioso")
    public List<TimeRecord> byStatusContenciosoInaccion() {
        return timeRecordRepository.findTop50000ByStatusOrderByRecordDateAsc("Contencioso");
    }

    @PostMapping
    public List<TimeRecord> save(@RequestBody Iterable<TimeRecord> timeRecordList) {
        return timeRecordRepository.saveAll(timeRecordList);
    }

    @DeleteMapping
    public void delete() {
        timeRecordRepository.deleteByRecordDateBefore(fourYearsAgo());
    }

    private LocalDate fourYearsAgo() {
        return LocalDate.now().minus(4, ChronoUnit.YEARS);
    }


}
