package com.driver.BookMyShow.convertors;


import com.driver.BookMyShow.Entities.TheaterEntity;
import com.driver.BookMyShow.EntryDtos.TheaterEntryDto;

public class TheaterConvertors {


    public static TheaterEntity convertDtoToEntity(TheaterEntryDto theaterEntryDto){

        return TheaterEntity.builder().location(theaterEntryDto.getLocation())
                .name(theaterEntryDto.getName()).build();

    }

}
