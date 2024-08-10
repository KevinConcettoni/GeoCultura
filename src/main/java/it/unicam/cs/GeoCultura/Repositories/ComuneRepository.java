package it.unicam.cs.GeoCultura.Repositories;

import it.unicam.cs.GeoCultura.Model.Comune;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComuneRepository extends CrudRepository<Comune,Integer> {
}
