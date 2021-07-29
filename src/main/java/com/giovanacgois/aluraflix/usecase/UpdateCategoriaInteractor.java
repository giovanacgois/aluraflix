package com.giovanacgois.aluraflix.usecase;

import com.giovanacgois.aluraflix.usecase.dto.CategoriaRequest;
import com.giovanacgois.aluraflix.usecase.dto.CategoriaResponse;

public interface UpdateCategoriaInteractor {
    CategoriaResponse execute(String id, CategoriaRequest categoriaRequest);
}
