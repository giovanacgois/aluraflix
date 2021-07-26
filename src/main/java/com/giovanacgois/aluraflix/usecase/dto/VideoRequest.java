package com.giovanacgois.aluraflix.usecase.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NotEmpty
@NotNull
public class VideoRequest {
    @NotEmpty @NotNull
    private String titulo;
    @NotEmpty @NotNull
    private String descricao;
    @NotEmpty @NotNull
    private String url;
}
