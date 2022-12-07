package gr.codelearn.moviesandtvseries.domain;

import gr.codelearn.moviesandtvseries.enums.MediaGenre;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Table(name = "tv_series")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TvSeries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tvSeriesName;
    private Integer durationInMin;
    @ManyToMany
    private List<Cast> cast;
    private MediaGenre genre;
    private double viewership;

}
