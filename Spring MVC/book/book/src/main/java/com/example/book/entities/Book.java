package com.example.book.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Book {

    @Id
    @GeneratedValue
    private int id;

    private String name;


}
