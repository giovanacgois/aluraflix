package com.giovanacgois.aluraflix.usecase;

import com.giovanacgois.aluraflix.domain.Video;
import com.giovanacgois.aluraflix.infrastructure.VideoRepository;
import com.giovanacgois.aluraflix.usecase.dto.VideoResponse;
import com.giovanacgois.aluraflix.usecase.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GetVideoByIdInteractor implements GetVideoByIdInteractorImpl {

    @Autowired
    VideoRepository videoRepository;

    @Override
    public VideoResponse execute(String id) {

        Optional<Video> optionalVideo = videoRepository.findById(id);
        //TODO: Exception handler - 404 not found
        return optionalVideo.map(VideoMapper::fromDomainToResponse).orElse(null);
    }
}
