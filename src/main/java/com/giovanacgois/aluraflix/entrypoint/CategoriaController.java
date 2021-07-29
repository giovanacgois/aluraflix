package com.giovanacgois.aluraflix.entrypoint;

import com.giovanacgois.aluraflix.usecase.GetCategoriasInteractor;
import com.giovanacgois.aluraflix.usecase.dto.CategoriaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    GetCategoriasInteractor getCategoriasInteractor;

    @GetMapping("/")
    private List<CategoriaResponse> getAllCategorias() {
        return getCategoriasInteractor.execute();
    }
}
