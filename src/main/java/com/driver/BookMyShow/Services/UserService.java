package com.driver.BookMyShow.Services;



import com.driver.BookMyShow.Entities.UserEntity;
import com.driver.BookMyShow.EntryDtos.UserEntryDto;
import com.driver.BookMyShow.Repository.UserRepository;
import com.driver.BookMyShow.convertors.UserConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public String addUser(UserEntryDto userEntryDto)throws Exception,NullPointerException{

        UserEntity userEntity = UserConvertor.convertDtoToEntity(userEntryDto);

        userRepository.save(userEntity);

        return "User Added successfully";

    }



}
