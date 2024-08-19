package it.unicam.cs.GeoCultura.Repositories;

import it.unicam.cs.GeoCultura.Model.CategoriaPOI;
import it.unicam.cs.GeoCultura.Model.Posizione;
import it.unicam.cs.GeoCultura.Model.PuntoDiInteresse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PuntoDiInteresseRepository extends CrudRepository<PuntoDiInteresse,Integer> {
    List<PuntoDiInteresse> ricercaPoi(
            String nome, String descrizione, CategoriaPOI categoria, Posizione luogo);
}
