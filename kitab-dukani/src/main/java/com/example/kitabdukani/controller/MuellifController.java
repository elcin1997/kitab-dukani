package com.example.kitabdukani.controller;

import com.example.kitabdukani.dto.request.MuellifRequest;
import com.example.kitabdukani.dto.responese.MuellifResponse;
import com.example.kitabdukani.service.MuellifService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/muellif")
@RequiredArgsConstructor
public class MuellifController {
    private final MuellifService muellifService;
    @PostMapping
     public MuellifResponse cereate( @RequestBody MuellifRequest request){
        return muellifService.create(request);
    }
}
