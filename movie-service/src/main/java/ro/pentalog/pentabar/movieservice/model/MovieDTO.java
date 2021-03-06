package ro.pentalog.pentabar.movieservice.model;

import lombok.Data;
import ro.pentalog.pentabar.movieservice.repository.Movie;

import java.util.List;

@Data
public class MovieDTO {
    
    private Long id;
    private String title;
    private String poster;
    private List<MovieReview> reviews;

    public MovieDTO(Movie movie, List<MovieReview> reviews) {
        this.id = movie.getId();
        this.title = movie.getTitle();
        this.poster = movie.getPoster();
        this.reviews = reviews;
    }
}
