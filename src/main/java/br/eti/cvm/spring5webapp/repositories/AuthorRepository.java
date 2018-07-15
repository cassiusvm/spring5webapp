package br.eti.cvm.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import br.eti.cvm.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
