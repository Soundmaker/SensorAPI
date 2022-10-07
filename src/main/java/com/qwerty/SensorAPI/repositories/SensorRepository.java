package com.qwerty.SensorAPI.repositories;

import com.qwerty.SensorAPI.models.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface SensorRepository extends JpaRepository<Sensor,Integer> {

    Optional<Sensor> findByName(String name);
}
