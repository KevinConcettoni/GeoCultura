package it.unicam.cs.GeoCultura.Repositories;

import it.unicam.cs.GeoCultura.Model.RuoloUtenteComune;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuoliComuneRepository extends CrudRepository<RuoloUtenteComune, Integer> {

}
