package com.giovanacgois.aluraflix.entrypoint;

import com.giovanacgois.aluraflix.usecase.GetVideoByIdInteractorImpl;
import com.giovanacgois.aluraflix.usecase.GetVideosInteractor;
import com.giovanacgois.aluraflix.usecase.dto.VideoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VideoController {

    @Autowired
    GetVideosInteractor getVideosInteractor;

    @Autowired
    GetVideoByIdInteractorImpl getVideoById;

    @GetMapping("/videos")
    public List<VideoResponse> getVideos() {
        return getVideosInteractor.execute();
    }

    @GetMapping("/video/{id}")
    public VideoResponse getVideoById(@PathVariable("id") String id) {
        return getVideoById.execute(id);
    }
}
