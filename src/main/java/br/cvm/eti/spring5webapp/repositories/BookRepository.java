package br.cvm.eti.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import br.cvm.eti.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
