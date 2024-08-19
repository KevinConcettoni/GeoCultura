package it.unicam.cs.GeoCultura.Services;

import it.unicam.cs.GeoCultura.Model.*;

import java.util.Date;
import java.util.List;

public interface IRicercaService {
    List<Contest> ricercaContest(String nome, Date dataInizio, Date dataFine, String tipo);
    List<Contenuto> ricercaContenuto(String nome, String descrizione, Date dataCreazione, String tipoContenuto);
    List<Itinerario> ricercaItinerario(String nome, String descrizione, Date dataCreazione, int livelloDifficolta);
    List<PuntoDiInteresse> ricercaPOI(String nome, String descrizione, CategoriaPOI categoria, Posizione luogo);
    List<Evento> ricercaEvento(String nome, String descrizione, Date dataInizio, Date dataFine);
}
