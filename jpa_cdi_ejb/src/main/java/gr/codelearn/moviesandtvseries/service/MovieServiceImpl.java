package gr.codelearn.moviesandtvseries.service;

import gr.codelearn.moviesandtvseries.domain.Movie;

import gr.codelearn.moviesandtvseries.enums.MediaGenre;
import gr.codelearn.moviesandtvseries.repository.AbstractRepository;
import gr.codelearn.moviesandtvseries.repository.MovieRepository;
import jakarta.ejb.Stateless;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class MovieServiceImpl extends AbstractService<Movie> implements MovieService{

    @PersistenceContext(unitName = "Persistence")
    protected EntityManager em;
    @Inject
    MovieRepository movieRepository;
    @Override
    public AbstractRepository<Movie, Long> getRepository() {
        return movieRepository;
    }


        public String getClassName() {
        return Movie.class.getSimpleName();
        }
    public Movie getMovieByName(String movieName) {
        return (Movie)  em.createQuery("Select u from "+getClassName()+" u where u.movieName= :movieName")
                .setParameter("movieName", movieName)
                .getSingleResult();
    }

    public List<Movie> getTopTenMovies() {
        return (List<Movie>) em.createQuery("Select u from Movie u order by u.ticketsSold DESC").setMaxResults(10).getResultList();
    }

    public List<Movie> getMoviesByGenre(MediaGenre mediaGenre) {
        return (List<Movie>) em.createQuery("Select u from Movie u where u.genre LIKE :mediaGenre")
                .setParameter("mediaGenre", mediaGenre)
                .getResultList();
    }
}
