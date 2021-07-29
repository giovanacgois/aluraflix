package com.giovanacgois.aluraflix.usecase.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoriaResponse {
    private String id;
    private String titulo;
    private String cor;
}
