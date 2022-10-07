package com.qwerty.SensorAPI.repositories;

import com.qwerty.SensorAPI.models.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {
}
