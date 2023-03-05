package com.driver.BookMyShow.Services;



import com.driver.BookMyShow.Entities.MovieEntity;
import com.driver.BookMyShow.EntryDtos.MovieEntryDto;
import com.driver.BookMyShow.Repository.MovieRepository;
import com.driver.BookMyShow.convertors.MovieConvertors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public String addMovie(MovieEntryDto movieEntryDto)throws Exception{


        MovieEntity movieEntity = MovieConvertors.convertEntryDtoToEntity(movieEntryDto);

        movieRepository.save(movieEntity);

        return "Movie Added successfully";


    }

}
