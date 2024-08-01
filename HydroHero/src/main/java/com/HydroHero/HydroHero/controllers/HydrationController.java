package com.HydroHero.HydroHero.controllers;


import com.HydroHero.HydroHero.models.HydrationRecord;
import com.HydroHero.HydroHero.repositories.HydrationRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hydration-records")
public class HydrationController {

    @Autowired
    private HydrationRecordRepository hydrationRecordRepository;

    @GetMapping
    public List<HydrationRecord> getAllRecords() {
        return hydrationRecordRepository.findAll();
    }

    @GetMapping("/user/{userId}")
    public List<HydrationRecord> getRecordsByUserId(@PathVariable Long userId) {
        return hydrationRecordRepository.findByUserId(userId);
    }

    @PostMapping
    public HydrationRecord createRecord(@RequestBody HydrationRecord record) {
        return hydrationRecordRepository.save(record);
    }

    @PutMapping("/{id}")
    public HydrationRecord updateRecord(@PathVariable Long id, @RequestBody HydrationRecord recordDetails) {
        HydrationRecord record = hydrationRecordRepository.findById(id).orElse(null);
        assert record != null;
        record.setTimestamp(recordDetails.getTimestamp());
        record.setAmount(recordDetails.getAmount());
        return hydrationRecordRepository.save(record);
    }

    @DeleteMapping("/{id}")
    public void deleteRecord(@PathVariable Long id) {
        hydrationRecordRepository.deleteById(id);
    }
}
