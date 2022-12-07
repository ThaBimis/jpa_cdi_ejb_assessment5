package gr.codelearn.moviesandtvseries.service;

import gr.codelearn.moviesandtvseries.domain.Cast;
import gr.codelearn.moviesandtvseries.domain.TvSeries;
import gr.codelearn.moviesandtvseries.repository.AbstractRepository;
import gr.codelearn.moviesandtvseries.repository.CastRepository;
import jakarta.inject.Inject;

public class CastServiceImpl extends AbstractService<Cast> implements CastService {

    @Inject
    CastRepository castRepository;


    public Class<TvSeries> getClassType() {
        return TvSeries.class;
    }

    @Override
    public AbstractRepository<Cast, Long> getRepository() {
        return castRepository;
    }

}
