package com.giovanacgois.aluraflix.usecase.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NotEmpty
@NotNull
public class CategoriaRequest {
    @NotEmpty
    @NotNull
    private String titulo;
    @NotEmpty
    @NotNull
    private String cor;
}
