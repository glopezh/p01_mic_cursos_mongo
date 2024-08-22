package com.cjava.cliente.model.repositories;

import com.cjava.cliente.model.docs.Curso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CursoRepository extends MongoRepository<Curso, String> {
}

