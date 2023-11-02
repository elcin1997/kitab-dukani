package com.example.kitabdukani.mapper;

import com.example.kitabdukani.dommain.Muellif;
import com.example.kitabdukani.dto.request.MuellifRequest;
import com.example.kitabdukani.dto.responese.MuellifResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MuellifMapper {
    MuellifMapper INSTANCE = Mappers.getMapper(MuellifMapper.class);
    @Mapping(target = "ad" ,source = "ad")
    @Mapping(target ="yas",source = "yas")
    Muellif muelifRequsetToMuellif(MuellifRequest request);
    @Mapping(target = "id" ,source = "id")
    @Mapping(target = "ad" ,source = "ad")
    @Mapping(target ="yas",source = "yas")
    MuellifResponse muellisToMuellifResponse(Muellif muellif);
}
