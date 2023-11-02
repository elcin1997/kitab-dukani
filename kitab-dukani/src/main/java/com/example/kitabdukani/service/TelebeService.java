package com.example.kitabdukani.service;

import com.example.kitabdukani.dto.request.TelebeRequest;
import com.example.kitabdukani.dto.responese.TelebeResponse;
import com.example.kitabdukani.mapper.TelebeMaper;
import com.example.kitabdukani.repository.TelebeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

@Service
@RequiredArgsConstructor
public class TelebeService {
    private final TelebeRepository telebeRepository;
    TelebeMaper mapper=TelebeMaper.INSTANCE;
    public TelebeResponse create(TelebeRequest request){
        var entity =mapper.telebeRequestToTelebe(request);
        var telebe =telebeRepository.save(entity);
        return mapper.telebeToTelebeResponse(telebe);
    }



}
