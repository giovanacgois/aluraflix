package com.giovanacgois.aluraflix.domain;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
@Data
@Builder
public class Categoria {
    @MongoId
    @Id
    private ObjectId id;
    private String titulo;
    private String cor;
}
