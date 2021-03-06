package com.tecacet.movie.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/**
 * Data Object containing all relevant information about a movie
 * 
 * @author dimitri
 *
 */
public interface Movie {

	String getTitle();

	int getYear();

	LocalDate getReleaseDate();

	String getPlot();

	int getDuration();

	Optional<Double> getRating();

	String getImageUrl();
	
	List<String> getActors();

	List<String> getDirectors();

	List<String> getGenres();

}