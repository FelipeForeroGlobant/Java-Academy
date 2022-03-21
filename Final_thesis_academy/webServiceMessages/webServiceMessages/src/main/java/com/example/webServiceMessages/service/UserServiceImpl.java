package com.example.webServiceMessages.service;

import com.example.webServiceMessages.dto.UserDTO;
import com.example.webServiceMessages.model.User;
import com.example.webServiceMessages.repository.IUserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.*;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    IUserRepository userRepository;

    @Autowired
    ObjectMapper mapper;

    public UserDTO readUser(Long id) {
        UserDTO userDTO = null;
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            userDTO = mapper.convertValue(user, UserDTO.class);
        }
        return userDTO;
    }


    public void createUser(UserDTO u){
        User user = mapper.convertValue(u, User.class);
        userRepository.save(user);
    }


    public void updateUser(UserDTO userDTO) {
        User user = mapper.convertValue(userDTO, User.class);
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }


    public Collection<UserDTO> getAll() {
        List<User> users = userRepository.findAll();
        Set<UserDTO> usersDTO = new HashSet<>();
        for (User user : users) {
            UserDTO userDTO = new UserDTO();

            userDTO.setId(user.getId());
            userDTO.setName(user.getName());
            userDTO.setLastName(user.getLastName());
            userDTO.setDni(user.getDni());
            userDTO.setAddress(user.getAddress());
            userDTO.setZipCodeCity(user.getZipCodeCity());
            userDTO.setState(user.getState());
            userDTO.setCountry(user.getCountry());
            userDTO.setUserName(user.getUserName());

            usersDTO.add(userDTO);
        }
        return usersDTO;
    }




}
