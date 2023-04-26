package gcu.backend.jpa_example.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
public class Item {
//    @Id
//    @Column
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

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
    public Item(String movie_id, String movie_name, String director, String actor) {
        this.movie_id = movie_id;
        this.movie_name = movie_name;
        this.director = director;
        this.actor = actor;
    }
}
