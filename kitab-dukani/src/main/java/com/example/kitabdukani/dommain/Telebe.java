package com.example.kitabdukani.dommain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Telebe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private String ad;
    private int yas;
}
