package com.giovanacgois.aluraflix.usecase;

import com.giovanacgois.aluraflix.infrastructure.VideoRepository;
import com.giovanacgois.aluraflix.usecase.dto.VideoResponse;
import com.giovanacgois.aluraflix.usecase.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetVideosInteractorImpl implements GetVideosInteractor {

    @Autowired
    VideoRepository videoRepository;

    @Override
    public List<VideoResponse> execute() {

        return VideoMapper.fromDomainToResponse(videoRepository.findAll());
    }
}
