package it.unicam.cs.GeoCultura.Repositories;

import it.unicam.cs.GeoCultura.Model.Itinerario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ItinerarioRepository extends CrudRepository<Itinerario,Integer> {
    List<Itinerario> ricercaItinerario(
            String nome, String descrizione, Date dataCreazione, int livelloDifficolta);
}
