package com.giovanacgois.aluraflix.usecase.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NotEmpty
@NotNull
public class VideoRequest {
    @NotEmpty(message = "O campo 'titulo' não pode ser vazio.")
    @NotNull(message = "O campo 'titulo' não pode ser nulo.")
    private String titulo;
    @NotEmpty(message = "O campo 'descricao' não pode ser vazio.")
    @NotNull(message = "O campo 'descricao' não pode ser nulo.")
    private String descricao;
    @NotEmpty(message = "O campo 'url' não pode ser vazio.")
    @NotNull(message = "O campo 'url' não pode ser nulo.")
    private String url;
}
