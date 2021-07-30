package com.giovanacgois.aluraflix.usecase.impl;

import com.giovanacgois.aluraflix.domain.Categoria;
import com.giovanacgois.aluraflix.infrastructure.CategoriaRepository;
import com.giovanacgois.aluraflix.usecase.GetCategoriasByIdInteractor;
import com.giovanacgois.aluraflix.usecase.dto.CategoriaResponse;
import com.giovanacgois.aluraflix.usecase.mapper.CategoriaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GetCategoriasByIdInteractorImpl implements GetCategoriasByIdInteractor {

    private final CategoriaRepository categoriaRepository;

    @Override
    public CategoriaResponse execute(String id) {
        Optional<Categoria> optionalCategoria = categoriaRepository.findById(id);

        if (optionalCategoria.isPresent()) {
            return CategoriaMapper.fromDomainToResponse(optionalCategoria.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "A categoria com ID " + id + " não existe na base de dados.");
        }
    }
}
