package it.unicam.cs.GeoCultura.Repositories;

import it.unicam.cs.GeoCultura.Model.Contenuto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContenutoRepository extends CrudRepository<Contenuto,Integer> {

}
