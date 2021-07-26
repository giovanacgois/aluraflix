package com.giovanacgois.aluraflix.usecase.impl;

import com.giovanacgois.aluraflix.infrastructure.VideoRepository;
import com.giovanacgois.aluraflix.usecase.RemoveVideoInteractor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemoveVideoInteractorImpl implements RemoveVideoInteractor {

    @Autowired
    VideoRepository videoRepository;

    @Override
    public void execute(String id) {
        videoRepository.deleteById(id);
    }
}
