package com.giovanacgois.aluraflix.usecase.impl;

import com.giovanacgois.aluraflix.domain.Categoria;
import com.giovanacgois.aluraflix.infrastructure.CategoriaRepository;
import com.giovanacgois.aluraflix.usecase.UpdateCategoriaInteractor;
import com.giovanacgois.aluraflix.usecase.dto.CategoriaRequest;
import com.giovanacgois.aluraflix.usecase.dto.CategoriaResponse;
import com.giovanacgois.aluraflix.usecase.mapper.CategoriaMapper;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

public class UpdateCategoriaInteractorImpl implements UpdateCategoriaInteractor {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public CategoriaResponse execute(String id, CategoriaRequest categoriaRequest) {
        Optional<Categoria> categoriaDatabase = categoriaRepository.findById(id);

        if (categoriaDatabase.isPresent()) {
            Categoria categoriaToSave = CategoriaMapper.fromRequestToDomain(categoriaRequest);
            categoriaToSave.setId(new ObjectId(id));
            return CategoriaMapper.fromDomainToResponse(categoriaRepository.save(categoriaToSave));
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "O vídeo com ID " + id + " não existe na base de dados.");
        }
    }
}
