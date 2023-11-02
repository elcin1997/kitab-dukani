package com.example.kitabdukani.controller;

import com.example.kitabdukani.dommain.Telebe;
import com.example.kitabdukani.dto.request.TelebeRequest;
import com.example.kitabdukani.dto.responese.TelebeResponse;
import com.example.kitabdukani.service.TelebeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/yoxla/telebe")
@RequiredArgsConstructor
public class TelebeController {
    private  final TelebeService telebeService;
    @PostMapping
    private TelebeResponse create(@RequestBody TelebeRequest telebeRequest){
        return  telebeService.create(telebeRequest);
    }


}
