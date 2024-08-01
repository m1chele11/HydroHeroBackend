package com.HydroHero.HydroHero.repositories;

import com.HydroHero.HydroHero.models.HydrationRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface HydrationRecordRepository extends JpaRepository<HydrationRecord, Long> {

    List<HydrationRecord> findByUserId(Long userId);

}
