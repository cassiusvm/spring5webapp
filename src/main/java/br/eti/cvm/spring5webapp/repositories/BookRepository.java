package br.eti.cvm.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import br.eti.cvm.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
