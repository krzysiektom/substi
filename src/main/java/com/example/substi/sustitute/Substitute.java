package com.example.substi.sustitute;


import javax.persistence.*;

@Entity
@Table(name = "substitutes")
public class Substitute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
}
