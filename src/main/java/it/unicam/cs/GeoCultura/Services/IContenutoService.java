package it.unicam.cs.GeoCultura.Services;

import it.unicam.cs.GeoCultura.Model.Evento;
import it.unicam.cs.GeoCultura.Model.Itinerario;
import it.unicam.cs.GeoCultura.Model.PuntoDiInteresse;

import java.util.List;

/**
 * Interfaccia che si occupa di gestire le operazioni CRUD dei contenuti (eventi, poi, itinerari)
 */
public interface IContenutoService {
    PuntoDiInteresse creaNuovoPuntoDiInteresse(PuntoDiInteresse puntoDiInteresse);
    Itinerario creaNuovoItinerario (Itinerario itinerario,List<Integer> contenuti);
    Evento creaNuovoEvento(Evento evento);
    List<Evento> getAllEventi();
    List<Itinerario> getAllItinerari();
    List<PuntoDiInteresse> getAllPoi();
    Evento getEvento(int id);
    Itinerario getItinerario(int id);
    PuntoDiInteresse getPoi(int id);
    void modificaEvento(Evento event);
    void modificaPoi(PuntoDiInteresse pointOfInterest);
    void modificaItinerario(Itinerario itinerary);
    void approvaItinerario(Integer id);
    void approvaPuntoDiInteresse(Integer id);
    void approvaEvento(Integer id);


}
