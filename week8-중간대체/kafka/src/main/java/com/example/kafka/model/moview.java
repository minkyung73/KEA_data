package com.example.kafka.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class moview {
    @Id
    @Column
    private String movie_id;

    @Column
    private String movie_name;

    @Column
    private String director;

    @Column
    private String actor;

    @Builder
    public moview(String movie_id, String movie_name, String director, String actor) {
        this.movie_id = movie_id;
        this.movie_name = movie_name;
        this.director = director;
        this.actor = actor;
    }
}
