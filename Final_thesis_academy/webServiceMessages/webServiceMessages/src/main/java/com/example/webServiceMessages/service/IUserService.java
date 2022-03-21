package com.example.webServiceMessages.service;

import com.example.webServiceMessages.dto.UserDTO;


import java.util.Collection;

public interface IUserService {

    public UserDTO readUser(Long id);

    public void createUser(UserDTO u);

    public void updateUser(UserDTO userDTO);

    public void deleteUser(Long id);

    public Collection<UserDTO> getAll();

}
