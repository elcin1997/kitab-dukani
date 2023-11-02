package com.example.kitabdukani.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TelebeRequest {
    @NotNull(message = "Ad bos ola bilmez")
    private String ad;
    private int yas;
}
