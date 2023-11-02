package com.example.kitabdukani.controller;

import com.example.kitabdukani.dto.request.KitabRequest;
import com.example.kitabdukani.dto.responese.KitabResponse;
import com.example.kitabdukani.service.KitabService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kitab")
@RequiredArgsConstructor
public class KitabController {
    private  final KitabService kitabService;
    @PostMapping
    public KitabResponse create(@RequestBody KitabRequest request){
        return kitabService.cereate(request);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        kitabService.delete(id);
    }

}
