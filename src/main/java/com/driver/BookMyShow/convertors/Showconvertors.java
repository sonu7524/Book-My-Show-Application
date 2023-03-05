package com.driver.BookMyShow.convertors;

import com.driver.BookMyShow.Entities.ShowEntity;
import com.driver.BookMyShow.EntryDtos.ShowEntryDto;

public class Showconvertors {


    public static ShowEntity convertEntryToEntity(ShowEntryDto showEntryDto){

        ShowEntity showEntity = ShowEntity.builder()
                .showDate(showEntryDto.getLocalDate())
                .showTime(showEntryDto.getLocalTime())
                .showType(showEntryDto.getShowType()).build();

        return showEntity;
    }
}
