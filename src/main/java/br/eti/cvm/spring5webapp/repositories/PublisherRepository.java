package br.eti.cvm.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import br.eti.cvm.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
