package com.giovanacgois.aluraflix.usecase;

import com.giovanacgois.aluraflix.usecase.dto.VideoResponse;

import java.util.List;


public interface GetVideosInteractor {
    List<VideoResponse> execute();
}
