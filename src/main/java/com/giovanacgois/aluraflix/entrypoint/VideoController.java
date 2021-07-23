package com.giovanacgois.aluraflix.entrypoint;

import com.giovanacgois.aluraflix.usecase.GetVideoById;
import com.giovanacgois.aluraflix.usecase.GetVideos;
import com.giovanacgois.aluraflix.usecase.dto.VideoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VideoController {

    @Autowired
    GetVideos getVideos;

    @Autowired
    GetVideoById getVideoById;

    @GetMapping("/videos")
    public List<VideoResponse> getVideos() {
        return getVideos.execute();
    }
}
