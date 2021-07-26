package com.giovanacgois.aluraflix.usecase;

import com.giovanacgois.aluraflix.usecase.dto.VideoRequest;
import com.giovanacgois.aluraflix.usecase.dto.VideoResponse;

import java.util.List;


public interface SaveVideoInteractor {
    VideoResponse execute(VideoRequest video);
}
