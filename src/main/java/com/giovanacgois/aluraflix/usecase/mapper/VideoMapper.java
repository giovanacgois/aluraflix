package com.giovanacgois.aluraflix.usecase.mapper;

import com.giovanacgois.aluraflix.domain.Video;
import com.giovanacgois.aluraflix.usecase.dto.VideoRequest;
import com.giovanacgois.aluraflix.usecase.dto.VideoResponse;
import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class VideoMapper {

    public static VideoResponse fromDomainToResponse(Video video) {
        return VideoResponse.builder()
                .titulo(video.getTitulo())
                .descricao(video.getDescricao())
                .url(video.getUrl())
                .build();
    }

    public static List<VideoResponse> fromDomainToResponse(List<Video> videos) {
        return videos.stream().map(VideoMapper::fromDomainToResponse).collect(Collectors.toList());
    }

    public static Video fromRequestToDomain(VideoRequest video) {
        return Video.builder()
                .titulo(video.getTitulo())
                .descricao(video.getDescricao())
                .url(video.getUrl())
                .build();
    }
}
