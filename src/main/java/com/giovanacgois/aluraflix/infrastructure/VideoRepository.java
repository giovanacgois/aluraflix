package com.giovanacgois.aluraflix.infrastructure;


import com.giovanacgois.aluraflix.domain.Video;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends MongoRepository<Video, String> {

}
