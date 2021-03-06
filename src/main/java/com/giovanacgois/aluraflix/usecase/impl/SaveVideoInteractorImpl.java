package com.giovanacgois.aluraflix.usecase.impl;

import com.giovanacgois.aluraflix.infrastructure.VideoRepository;
import com.giovanacgois.aluraflix.usecase.SaveVideoInteractor;
import com.giovanacgois.aluraflix.usecase.dto.VideoRequest;
import com.giovanacgois.aluraflix.usecase.dto.VideoResponse;
import com.giovanacgois.aluraflix.usecase.mapper.VideoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaveVideoInteractorImpl implements SaveVideoInteractor {

    private final VideoRepository videoRepository;

    @Override
    public VideoResponse execute(VideoRequest video) {
        return VideoMapper.fromDomainToResponse(
                videoRepository.save(VideoMapper.fromRequestToDomain(video)));
    }
}
