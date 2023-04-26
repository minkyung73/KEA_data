package com.example.kafka.controller;

import com.example.kafka.dao.KafkaRepository;
import com.example.kafka.dto.KafkaDTO;
import com.example.kafka.model.moview;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class KafkaController {
    private final KafkaRepository kafkaRepository;

    @PostMapping("/api/movie")
    public String add(@RequestBody KafkaDTO kafkaDTO) {
        moview movie = moview.builder()
                .actor(kafkaDTO.getActor())
                .director(kafkaDTO.getDirector())
                .movie_id(kafkaDTO.getMovie_id())
                .movie_name(kafkaDTO.getMovie_name())
                .build();

        moview save = kafkaRepository.save(movie);
        return save.getMovie_id();
    }
}
