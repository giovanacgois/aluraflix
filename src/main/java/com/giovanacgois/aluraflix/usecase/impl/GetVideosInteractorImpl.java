package com.giovanacgois.aluraflix.usecase.impl;

import com.giovanacgois.aluraflix.infrastructure.VideoRepository;
import com.giovanacgois.aluraflix.usecase.GetVideosInteractor;
import com.giovanacgois.aluraflix.usecase.dto.VideoResponse;
import com.giovanacgois.aluraflix.usecase.mapper.VideoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetVideosInteractorImpl implements GetVideosInteractor {

    private final VideoRepository videoRepository;

    @Override
    public List<VideoResponse> execute() {

        return VideoMapper.fromDomainToResponse(videoRepository.findAll());
    }
}
