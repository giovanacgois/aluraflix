package com.giovanacgois.aluraflix.usecase;

import com.giovanacgois.aluraflix.infrastructure.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RemoveCategoriaInteractorImpl implements RemoveCategoriaInteractor {

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public void execute(String id) {
        categoriaRepository.deleteById(id);
    }
}
