package com.giovanacgois.aluraflix.usecase;

import com.giovanacgois.aluraflix.usecase.dto.VideoRequest;
import com.giovanacgois.aluraflix.usecase.dto.VideoResponse;

public interface UpdateVideoInteractor {

    VideoResponse execute(String id, VideoRequest video);
}
