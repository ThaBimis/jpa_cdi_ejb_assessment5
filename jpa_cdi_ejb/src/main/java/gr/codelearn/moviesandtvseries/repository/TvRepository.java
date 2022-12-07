package gr.codelearn.moviesandtvseries.repository;

import gr.codelearn.moviesandtvseries.domain.Movie;
import gr.codelearn.moviesandtvseries.domain.TvSeries;
import jakarta.ejb.Stateless;

@Stateless
public class TvRepository extends AbstractRepository<TvSeries,Long> {
    @Override
    public Class<TvSeries> getClassType() {
        return TvSeries.class;
    }



}