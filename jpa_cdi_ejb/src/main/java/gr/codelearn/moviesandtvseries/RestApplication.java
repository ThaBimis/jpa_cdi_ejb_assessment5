package gr.codelearn.moviesandtvseries;

import gr.codelearn.moviesandtvseries.repository.MovieRepository;
import gr.codelearn.moviesandtvseries.service.MovieServiceImpl;
import jakarta.inject.Inject;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api")
public class RestApplication extends Application {

}