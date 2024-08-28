package it.unicam.cs.GeoCultura.Repositories;

import it.unicam.cs.GeoCultura.Model.Notifica;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificaRepository extends CrudRepository<Notifica, Integer> {

}
