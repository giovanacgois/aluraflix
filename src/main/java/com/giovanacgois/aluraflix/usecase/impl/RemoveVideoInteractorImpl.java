package com.giovanacgois.aluraflix.usecase.impl;

import com.giovanacgois.aluraflix.infrastructure.VideoRepository;
import com.giovanacgois.aluraflix.usecase.RemoveVideoInteractor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RemoveVideoInteractorImpl implements RemoveVideoInteractor {

    private final VideoRepository videoRepository;

    @Override
    public void execute(String id) {
        videoRepository.deleteById(id);
    }
}
