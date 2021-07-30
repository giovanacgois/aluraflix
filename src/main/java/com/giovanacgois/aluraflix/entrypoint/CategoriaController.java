package com.giovanacgois.aluraflix.entrypoint;

import com.giovanacgois.aluraflix.usecase.*;
import com.giovanacgois.aluraflix.usecase.dto.CategoriaRequest;
import com.giovanacgois.aluraflix.usecase.dto.CategoriaResponse;
import com.giovanacgois.aluraflix.usecase.mapper.CategoriaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/categorias")
@RequiredArgsConstructor
public class CategoriaController {

    private final GetCategoriasInteractor getCategoriasInteractor;
    private final GetCategoriasByIdInteractor getCategoriasByIdInteractor;
    private final SaveCategoriaInteractor saveCategoriaInteractor;
    private final RemoveCategoriaInteractor removeCategoriaInteractor;
    private final UpdateCategoriaInteractor updateCategoriaInteractor;

    @GetMapping("/")
    private List<CategoriaResponse> getAllCategorias() {
        return getCategoriasInteractor.execute();
    }

    @GetMapping("/{id}")
    private CategoriaResponse getCategoriaById(@PathVariable("id") String id) {
        return getCategoriasByIdInteractor.execute(id);
    }

    @PostMapping("/")
    private CategoriaResponse saveCategoria(@Valid @RequestBody CategoriaRequest categoriaRequest) {
        return CategoriaMapper.fromDomainToResponse(saveCategoriaInteractor.execute(categoriaRequest));
    }

    @PutMapping("/{id}")
    private CategoriaResponse saveCategoria(@PathVariable("id") String id,
                                            @Valid @RequestBody CategoriaRequest categoriaRequest) {
        return updateCategoriaInteractor.execute(id, categoriaRequest);
    }


    @DeleteMapping("/{id}")
    private void removeCategoria(@PathVariable("id") String id) {
        removeCategoriaInteractor.execute(id);
    }
}
