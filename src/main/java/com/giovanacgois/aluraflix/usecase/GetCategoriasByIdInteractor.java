package com.giovanacgois.aluraflix.usecase;

import com.giovanacgois.aluraflix.usecase.dto.CategoriaResponse;


public interface GetCategoriasByIdInteractor {
    CategoriaResponse execute(String id);
}
