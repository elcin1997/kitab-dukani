package com.example.kitabdukani.dto.request;

import com.example.kitabdukani.dommain.Muellif;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KitabRequest {
    @NotNull(message = "Ad bos ola bilmez")
    private  String ad;

    private Muellif muellif;

}
