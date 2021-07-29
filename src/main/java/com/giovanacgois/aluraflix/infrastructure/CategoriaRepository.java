package com.giovanacgois.aluraflix.infrastructure;


import com.giovanacgois.aluraflix.domain.Categoria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends MongoRepository<Categoria, String> {

}
