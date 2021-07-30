package com.giovanacgois.aluraflix.usecase.impl;

import com.giovanacgois.aluraflix.domain.Video;
import com.giovanacgois.aluraflix.infrastructure.VideoRepository;
import com.giovanacgois.aluraflix.usecase.UpdateVideoInteractor;
import com.giovanacgois.aluraflix.usecase.dto.VideoRequest;
import com.giovanacgois.aluraflix.usecase.dto.VideoResponse;
import com.giovanacgois.aluraflix.usecase.mapper.VideoMapper;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UpdateVideoInteractorImpl implements UpdateVideoInteractor {

    private final VideoRepository videoRepository;

    public VideoResponse execute(String id, VideoRequest video) {

        Optional<Video> videoDatabase = videoRepository.findById(id);

        if (videoDatabase.isPresent()) {
            Video videoToSave = VideoMapper.fromRequestToDomain(video);
            videoToSave.setId(new ObjectId(id));
            return VideoMapper.fromDomainToResponse(videoRepository.save(videoToSave));
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "O vídeo com ID " + id + " não existe na base de dados.");
        }
    }
}