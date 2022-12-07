package gr.codelearn.moviesandtvseries.repository;

import gr.codelearn.moviesandtvseries.domain.Movie;
import jakarta.ejb.Stateless;


@Stateless
public class MovieRepository extends AbstractRepository<Movie,Long> {
    @Override
    public Class<Movie> getClassType() {
        return Movie.class;
    }



}
