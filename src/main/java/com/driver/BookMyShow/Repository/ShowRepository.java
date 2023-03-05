package com.driver.BookMyShow.Repository;


import com.driver.BookMyShow.Entities.ShowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<ShowEntity,Integer> {

}
