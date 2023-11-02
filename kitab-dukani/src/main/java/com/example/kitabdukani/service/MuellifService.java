package com.example.kitabdukani.service;

import com.example.kitabdukani.dto.request.MuellifRequest;
import com.example.kitabdukani.dto.responese.MuellifResponse;
import com.example.kitabdukani.mapper.MuellifMapper;
import com.example.kitabdukani.repository.MuellifRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MuellifService {
    private  final MuellifRepository muellifRepository;
    MuellifMapper mapper = MuellifMapper.INSTANCE;

    public MuellifResponse create(MuellifRequest request){
        var entity =mapper.muelifRequsetToMuellif(request);
        var muellif = muellifRepository.save(entity);
        return  mapper.muellisToMuellifResponse(muellif);
    }
}
