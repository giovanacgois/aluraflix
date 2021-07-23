package com.giovanacgois.aluraflix.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
public class Video {
    private String titulo;
    private String descricao;
    private String url;
}
