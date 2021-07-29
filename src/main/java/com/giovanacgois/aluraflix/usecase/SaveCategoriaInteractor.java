package com.giovanacgois.aluraflix.usecase;

import com.giovanacgois.aluraflix.domain.Categoria;
import com.giovanacgois.aluraflix.usecase.dto.CategoriaRequest;


public interface SaveCategoriaInteractor {
    Categoria execute(CategoriaRequest categoriaRequest);
}
