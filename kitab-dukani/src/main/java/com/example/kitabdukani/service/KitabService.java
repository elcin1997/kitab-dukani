package com.example.kitabdukani.service;

import com.example.kitabdukani.dto.request.KitabRequest;
import com.example.kitabdukani.dto.responese.KitabResponse;
import com.example.kitabdukani.mapper.KitabMaper;
import com.example.kitabdukani.repository.KitabRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KitabService {
    private  final KitabRepository kitabRepository;
    KitabMaper maper =KitabMaper.INSTANCE;
    public KitabResponse cereate(KitabRequest kitabRequest){
       var entity = maper.kitabRequestToKitab(kitabRequest);
       var kitab = kitabRepository.save(entity);
       return maper.kitabToKitabResponse(kitab);
    }

    public  void  delete(Integer id){
        kitabRepository.deleteById(id);
    }



}
