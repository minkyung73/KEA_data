package com.example.kafka.dao;

import com.example.kafka.model.moview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KafkaRepository extends JpaRepository<moview, String> {
}
