package com.teste.demo.service;

import com.teste.demo.model.Movie;
import com.teste.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(Long id) {
        return movieRepository.findById(id);
    }

    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public void deleteMovie(Long id) {
        if (movieRepository.existsById(id)){
            movieRepository.deleteById(id);
        }
    }

    public Movie updateById(Movie movie, Long id) {
        Optional<Movie> op = movieRepository.findById(id);
        if (op.isPresent()){
            Movie obj = op.get();
            obj.setTitle(movie.getTitle());
            obj.setDirector(movie.getDirector());
            obj.setSynopsis(movie.getSynopsis());
            obj.setGender(movie.getGender());
            obj.setYear(movie.getYear());
            movieRepository.save(obj);
            return obj;
        }
        return null;
    }
}
