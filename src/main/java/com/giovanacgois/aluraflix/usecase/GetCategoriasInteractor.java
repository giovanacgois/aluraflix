package com.giovanacgois.aluraflix.usecase;

import com.giovanacgois.aluraflix.usecase.dto.CategoriaResponse;

import java.util.List;


public interface GetCategoriasInteractor {
    List<CategoriaResponse> execute();
}
