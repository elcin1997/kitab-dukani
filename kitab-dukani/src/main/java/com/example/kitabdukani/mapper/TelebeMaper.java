package com.example.kitabdukani.mapper;

import com.example.kitabdukani.dommain.Kitab;
import com.example.kitabdukani.dommain.Telebe;
import com.example.kitabdukani.dto.request.KitabRequest;
import com.example.kitabdukani.dto.request.TelebeRequest;
import com.example.kitabdukani.dto.responese.TelebeResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TelebeMaper {
    TelebeMaper INSTANCE = Mappers.getMapper(TelebeMaper.class);

    @Mapping(target = "ad" ,source = "ad")
    @Mapping(target ="yas",source = "yas")
    Telebe telebeRequestToTelebe(TelebeRequest request);



    @Mapping(target = "id" ,source = "id")
    @Mapping(target = "ad" ,source = "ad")
    @Mapping(target ="yas",source = "yas")
    TelebeResponse telebeToTelebeResponse(Telebe telebe);

}
