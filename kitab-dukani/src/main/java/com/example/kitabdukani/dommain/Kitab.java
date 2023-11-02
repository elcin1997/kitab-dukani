package com.example.kitabdukani.dommain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Kitab {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private  String ad;
    @ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
    private Muellif muellif;
}
