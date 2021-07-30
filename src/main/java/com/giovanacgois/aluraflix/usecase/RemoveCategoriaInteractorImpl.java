package com.giovanacgois.aluraflix.usecase;

import com.giovanacgois.aluraflix.infrastructure.CategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RemoveCategoriaInteractorImpl implements RemoveCategoriaInteractor {

    private final CategoriaRepository categoriaRepository;

    @Override
    public void execute(String id) {
        categoriaRepository.deleteById(id);
    }
}
