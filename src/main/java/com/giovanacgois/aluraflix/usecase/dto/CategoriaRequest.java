package com.giovanacgois.aluraflix.usecase.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder
public class CategoriaRequest {
    @NotEmpty(message = "O campo 'titulo' não pode ser vazio")
    @NotNull(message = "O campo 'titulo' não pode ser nulo.")
    private String titulo;
    @NotEmpty(message = "O campo 'cor' não pode ser vazio.")
    @NotNull(message = "O campo 'cor' não pode ser nulo.")
    private String cor;
}
