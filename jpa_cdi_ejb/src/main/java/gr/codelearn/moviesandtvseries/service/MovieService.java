package gr.codelearn.moviesandtvseries.service;

import gr.codelearn.moviesandtvseries.domain.Movie;

public interface MovieService extends BaseService<Movie,Long>{

    Movie getMovieByName(String movieName);
}
