package com.giovanacgois.aluraflix.usecase.mapper;

import com.giovanacgois.aluraflix.domain.Video;
import com.giovanacgois.aluraflix.usecase.dto.VideoResponse;
import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class VideoMapper {

    private static VideoResponse fromDomainToResponse(Video video) {
        return VideoResponse.builder()
                .titulo(video.getTitulo())
                .descricao(video.getDescricao())
                .build();
    }

    public static List<VideoResponse> fromDomainToResponse(List<Video> videos) {
        return videos.stream().map(video -> fromDomainToResponse(video)).collect(Collectors.toList());
    }
}
