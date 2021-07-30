package com.giovanacgois.aluraflix.usecase.impl;

import com.giovanacgois.aluraflix.domain.Video;
import com.giovanacgois.aluraflix.infrastructure.VideoRepository;
import com.giovanacgois.aluraflix.usecase.GetVideoByIdInteractor;
import com.giovanacgois.aluraflix.usecase.dto.VideoResponse;
import com.giovanacgois.aluraflix.usecase.mapper.VideoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GetVideoByIdInteractorImpl implements GetVideoByIdInteractor {

    private final VideoRepository videoRepository;

    @Override
    public VideoResponse execute(String id) {
        Optional<Video> optionalVideo = videoRepository.findById(id);
        return optionalVideo.map(VideoMapper::fromDomainToResponse).orElse(null);
    }
}
