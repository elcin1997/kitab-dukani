package com.example.kitabdukani.mapper;

import com.example.kitabdukani.dommain.Kitab;
import com.example.kitabdukani.dto.request.KitabRequest;
import com.example.kitabdukani.dto.responese.KitabResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface KitabMaper {
    KitabMaper INSTANCE = Mappers.getMapper(KitabMaper.class);
    @Mapping(target = "ad" ,source = "ad")
    @Mapping(target ="muellif",source = "muellif")
    Kitab  kitabRequestToKitab(KitabRequest kitabRequest);


    @Mapping(target = "id" ,source = "id")
    @Mapping(target = "ad" ,source = "ad")
    @Mapping(target ="muellif",source = "muellif")
    KitabResponse kitabToKitabResponse(Kitab kitab);

}
