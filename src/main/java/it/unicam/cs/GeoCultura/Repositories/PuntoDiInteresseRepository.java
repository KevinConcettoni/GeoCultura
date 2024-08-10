package it.unicam.cs.GeoCultura.Repositories;

import it.unicam.cs.GeoCultura.Model.PuntoDiInteresse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;
import org.springframework.stereotype.Repository;

@Repository
public interface PuntoDiInteresseRepository extends CrudRepository<PuntoDiInteresse,Integer> {
}
