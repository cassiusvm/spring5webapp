package br.cvm.eti.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import br.cvm.eti.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
