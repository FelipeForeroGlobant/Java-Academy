package com.example.webServiceMessages.controller;


import com.example.webServiceMessages.dto.UserDTO;
import com.example.webServiceMessages.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/employees")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody UserDTO userDTO){
        userService.createUser(userDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public UserDTO getUser(@PathVariable long id){
        return userService.readUser(id);
    }

    @PutMapping()
    public ResponseEntity<?> updateUser(@RequestBody UserDTO userDTO)
    {
        userService.updateUser(userDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable long id)
    {
        userService.deleteUser(id);
        return ResponseEntity.status(HttpStatus.OK).body("delete");

    }

    @GetMapping("/list")
    public Collection<UserDTO> listUsers()
    {
        return userService.getAll();
    }





}
