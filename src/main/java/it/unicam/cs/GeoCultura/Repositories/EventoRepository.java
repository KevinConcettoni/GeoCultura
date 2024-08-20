package it.unicam.cs.GeoCultura.Repositories;

import it.unicam.cs.GeoCultura.Model.Evento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EventoRepository extends CrudRepository<Evento,Integer> {
    @Query("SELECT e FROM Evento e WHERE e.nome = :nome AND e.descrizione = :descrizione AND " +
            "(e.dataInizio BETWEEN :dataInizio AND :dataFine OR e.dataFine BETWEEN :dataInizio AND :dataFine)")
    List<Evento> ricercaEvento(
            @Param("nome") String nome,
            @Param("descrizione") String descrizione,
            @Param("dataInizio") Date dataInizio,
            @Param("dataFine") Date dataFine);
}

