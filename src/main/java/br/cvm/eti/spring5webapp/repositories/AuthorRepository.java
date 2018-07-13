package br.cvm.eti.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import br.cvm.eti.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
