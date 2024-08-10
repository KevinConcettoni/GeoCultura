package it.unicam.cs.GeoCultura.Repositories;

import it.unicam.cs.GeoCultura.Model.Itinerario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItinerarioRepository extends CrudRepository<Itinerario,Integer> {

}
