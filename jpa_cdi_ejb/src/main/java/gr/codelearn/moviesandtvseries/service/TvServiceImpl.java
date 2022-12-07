package gr.codelearn.moviesandtvseries.service;


import gr.codelearn.moviesandtvseries.domain.Movie;

import gr.codelearn.moviesandtvseries.domain.TvSeries;
import gr.codelearn.moviesandtvseries.enums.MediaGenre;
import gr.codelearn.moviesandtvseries.repository.AbstractRepository;
import gr.codelearn.moviesandtvseries.repository.MovieRepository;
import gr.codelearn.moviesandtvseries.repository.TvRepository;
import jakarta.ejb.Stateless;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class TvServiceImpl extends AbstractService<TvSeries> implements TvService{

    @PersistenceContext(unitName = "Persistence")
    protected EntityManager em;
    @Inject
    TvRepository tvRepository;
    @Override
    public AbstractRepository<TvSeries, Long> getRepository() {
        return tvRepository;
    }


    public String getClassName() {
        return TvSeries.class.getSimpleName();
    }

}

