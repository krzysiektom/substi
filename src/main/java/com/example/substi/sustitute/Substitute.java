package com.example.substi.sustitute;


import com.example.substi.substituteLocation.SubstituteLocation;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "substitutes")
public class Substitute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private SubstituteLocation location;
    private LocalDateTime dateTime;



}
