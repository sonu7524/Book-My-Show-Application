package com.driver.BookMyShow.Repository;

import com.driver.BookMyShow.Entities.MovieEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity,Integer> {
}
