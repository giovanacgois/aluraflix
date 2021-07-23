package com.giovanacgois.aluraflix.usecase;


import com.giovanacgois.aluraflix.usecase.dto.VideoResponse;

public interface GetVideoByIdInteractorImpl {
    VideoResponse execute(String id);
}
