package com.giovanacgois.aluraflix.usecase;


import com.giovanacgois.aluraflix.usecase.dto.VideoResponse;

public interface GetVideoByIdInteractor {
    VideoResponse execute(String id);
}
