package com.driver.BookMyShow.Controller;


import com.driver.BookMyShow.EntryDtos.TicketEntryDto;
import com.driver.BookMyShow.Services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @PostMapping("/book")
    public String bookTicket(@RequestBody TicketEntryDto ticketEntryDto){


        try{
            String result = ticketService.addTicket(ticketEntryDto);
            return result;

        }catch (Exception e){

            return "";
        }
    }
}
