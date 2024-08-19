package it.unicam.cs.GeoCultura.Repositories;

import it.unicam.cs.GeoCultura.Model.Contest;
import it.unicam.cs.GeoCultura.Model.Evento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ContestRepository extends CrudRepository<Contest,Integer> {
    @Query("SELECT c FROM Contest c WHERE c.nome = :nome AND c.dataInizio BETWEEN :dataInizio AND :dataFine AND c.tipo = :tipo")//TODO verevicare
    List<Contest> ricercaContest(
            @Param("nome") String nome,
            @Param("dataInizio") Date dataInizio,
            @Param("dataFine") Date dataFine,
            @Param("tipo") String tipo);
}
