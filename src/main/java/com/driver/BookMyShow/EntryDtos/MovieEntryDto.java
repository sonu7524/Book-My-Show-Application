package com.driver.BookMyShow.EntryDtos;


import com.driver.BookMyShow.Enums.Genre;
import com.driver.BookMyShow.Enums.Language;
import lombok.Data;

import javax.persistence.*;

@Data
public class MovieEntryDto {

    private String movieName;

    private double ratings;

    private int duration;

    private Language language;

    private Genre genre;

}
