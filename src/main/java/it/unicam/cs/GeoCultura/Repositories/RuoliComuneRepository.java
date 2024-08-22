package it.unicam.cs.GeoCultura.Repositories;

import it.unicam.cs.GeoCultura.Model.RuoloUtenteComune;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RuoliComuneRepository extends CrudRepository<RuoloUtenteComune, Integer> {
    @Query("SELECT c FROM RuoloUtenteComune c WHERE c.utente.ID = :IdUtente")
    List<RuoloUtenteComune> cercaRuoliPerId(@Param("IdUtente") Integer IdUtente);
}
