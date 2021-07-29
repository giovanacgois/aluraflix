package com.giovanacgois.aluraflix.usecase.mapper;

import com.giovanacgois.aluraflix.domain.Categoria;
import com.giovanacgois.aluraflix.usecase.dto.CategoriaRequest;
import com.giovanacgois.aluraflix.usecase.dto.CategoriaResponse;
import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class CategoriaMapper {

    public static CategoriaResponse fromDomainToResponse(Categoria categoria) {
        return CategoriaResponse.builder()
                .id(categoria.getId().toString())
                .titulo(categoria.getTitulo())
                .cor(categoria.getCor())
                .build();
    }

    public static List<CategoriaResponse> fromDomainToResponse(List<Categoria> categorias) {
        return categorias.stream().map(CategoriaMapper::fromDomainToResponse).collect(Collectors.toList());
    }

    public static Categoria fromRequestToDomain(CategoriaRequest categoriaRequest) {
        return Categoria.builder()
                .titulo(categoriaRequest.getTitulo())
                .cor(categoriaRequest.getCor())
                .build();
    }
}
