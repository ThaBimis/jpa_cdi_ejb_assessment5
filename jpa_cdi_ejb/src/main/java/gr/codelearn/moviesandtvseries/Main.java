package gr.codelearn.moviesandtvseries;



import gr.codelearn.moviesandtvseries.domain.Cast;
import gr.codelearn.moviesandtvseries.domain.Movie;
import gr.codelearn.moviesandtvseries.domain.TvSeries;
import gr.codelearn.moviesandtvseries.enums.JobCategory;
import gr.codelearn.moviesandtvseries.enums.MediaGenre;
import gr.codelearn.moviesandtvseries.service.CastServiceImpl;
import gr.codelearn.moviesandtvseries.service.MovieService;
import gr.codelearn.moviesandtvseries.service.MovieServiceImpl;
import gr.codelearn.moviesandtvseries.service.TvServiceImpl;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;

@Singleton
@Startup
@Log4j2
public class Main{

    @Inject
    private MovieServiceImpl movieServiceImpl;

    @Inject
    private CastServiceImpl castServiceImpl;

    @Inject
    private TvServiceImpl tvServiceImpll;




    @PostConstruct
        public void test() {
        //lists about cast and movies
        List<Movie> moviesList = new ArrayList<>();
        List<Cast> castList = new ArrayList<>();

        //inserting data
        Cast actor1 = Cast.builder().jobCategory(JobCategory.ACTOR).name("Tom Hanks").build();
        Cast actor2 = Cast.builder().jobCategory(JobCategory.ACTOR).name("Julia Roberts").build();
        Movie movie1 = Movie.builder().movieName("Avatar").durationInMin(200).genre(MediaGenre.ACTION).ticketsSold(200_000_000).build();
        Movie movie2 = Movie.builder().movieName("Avengers").durationInMin(220).genre(MediaGenre.SUPERHERO).ticketsSold(250_000_000).build();
        TvSeries tvSeries1 = TvSeries.builder().tvSeriesName("The Office").build();
        TvSeries tvSeries2 = TvSeries.builder().tvSeriesName("Friends").build();
        //adding to list
        moviesList.add(movie1);
        castList.add(actor1);
        castList.add(actor2);
        actor1.setMovies(moviesList);
        movie1.setCast(castList);

        //creating entries
        castServiceImpl.create(actor1);
        movieServiceImpl.create(movie1);
        movieServiceImpl.create(movie2);
        tvServiceImpll.create(tvSeries1);
        tvServiceImpll.create(tvSeries2);




        //For Some reason that i didnt have the time to resolve, the searches wont work correctly

        ///search by name
        //log.info("Searching for movie Avatar. Results: {}",movieServiceImpl.getMovieByName("Avatar"));
        //Find top 10 movies
        log.info("Display top 10 Movies: {}", movieServiceImpl.getTopTenMovies().stream().toArray());
        //Find movies by genre
        log.info("Display movies by genre:{}", movieServiceImpl.getMoviesByGenre(MediaGenre.ACTION));
        //search by

    }


}
