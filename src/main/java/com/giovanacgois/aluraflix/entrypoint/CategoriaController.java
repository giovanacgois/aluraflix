package com.giovanacgois.aluraflix.entrypoint;

import com.giovanacgois.aluraflix.usecase.GetCategoriasByIdInteractor;
import com.giovanacgois.aluraflix.usecase.GetCategoriasInteractor;
import com.giovanacgois.aluraflix.usecase.SaveCategoriaInteractor;
import com.giovanacgois.aluraflix.usecase.dto.CategoriaRequest;
import com.giovanacgois.aluraflix.usecase.dto.CategoriaResponse;
import com.giovanacgois.aluraflix.usecase.mapper.CategoriaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    GetCategoriasInteractor getCategoriasInteractor;
    @Autowired
    GetCategoriasByIdInteractor getCategoriasByIdInteractor;
    @Autowired
    SaveCategoriaInteractor saveCategoriaInteractor;

    @GetMapping("/")
    private List<CategoriaResponse> getAllCategorias() {
        return getCategoriasInteractor.execute();
    }

    @GetMapping("/{id}")
    private CategoriaResponse getCategoriaById(@PathVariable("id") String id) {
        return getCategoriasByIdInteractor.execute(id);
    }

    @PostMapping("/")
    private CategoriaResponse saveCategoria(@RequestBody CategoriaRequest categoriaRequest) {
        return CategoriaMapper.fromDomainToResponse(saveCategoriaInteractor.execute(categoriaRequest));
    }
}
