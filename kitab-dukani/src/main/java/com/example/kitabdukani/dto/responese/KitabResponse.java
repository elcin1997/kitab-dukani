package com.example.kitabdukani.dto.responese;

import com.example.kitabdukani.dommain.Muellif;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KitabResponse {
    private  int id;
    private  String ad;
    private Muellif muellif;
}
