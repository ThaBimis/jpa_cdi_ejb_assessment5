package gr.codelearn.moviesandtvseries.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import gr.codelearn.moviesandtvseries.enums.JobCategory;
import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Builder
public class Cast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private JobCategory jobCategory;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "cast", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Movie> movies;


}
