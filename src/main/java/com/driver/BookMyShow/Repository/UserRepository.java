package com.driver.BookMyShow.Repository;


import com.driver.BookMyShow.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
