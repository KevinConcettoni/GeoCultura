package it.unicam.cs.GeoCultura.Services;

import it.unicam.cs.GeoCultura.Model.*;
import it.unicam.cs.GeoCultura.Repositories.*;
import jdk.jshell.spi.ExecutionControl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class RicercaService implements IRicercaService{
    private final ContestRepository contestRepository;
    private final ItinerarioRepository itinerarioRepository;
    private final PuntoDiInteresseRepository puntoDiInteresseRepository;
    private final EventoRepository eventoRepository;
    private final ContenutoRepository contenutoRepository;

    public RicercaService(ContestRepository contestRepository, ItinerarioRepository itinerarioRepository, PuntoDiInteresseRepository puntoDiInteresseRepository, EventoRepository eventoRepository, ContenutoRepository contenutoRepository) {
        this.contestRepository = contestRepository;
        this.itinerarioRepository = itinerarioRepository;
        this.puntoDiInteresseRepository = puntoDiInteresseRepository;
        this.eventoRepository = eventoRepository;
        this.contenutoRepository = contenutoRepository;
    }


    @Override
    public List<Contest> ricercaContest(String nome, Date dataInizio, Date dataFine, String tipo) {
        return contestRepository.ricercaContest(nome, dataInizio, dataFine, tipo);
    }

    @Override
    public List<Contenuto> ricercaContenuto(String nome, String descrizione, Date dataCreazione, String tipoContenuto) {
        //TODO Implementare
        return List.of();
    }

    @Override
    public List<Itinerario> ricercaItinerario(String nome, String descrizione, Date dataCreazione, int livelloDifficolta) {
        return itinerarioRepository.ricercaItinerario(nome, descrizione, dataCreazione, livelloDifficolta);
    }

    @Override
    public List<PuntoDiInteresse> ricercaPuntoDiInteresse(String nome, String descrizione, CategoriaPOI categoria, Posizione luogo) {
        return puntoDiInteresseRepository.ricercaPoi(nome, descrizione, categoria, luogo);
    }

    @Override
    public List<Evento> ricercaEvento(String nome, String descrizione, Date dataInizio, Date dataFine) {
        return eventoRepository.ricercaEvento(
                nome, descrizione, dataInizio, dataFine);
    }
}
