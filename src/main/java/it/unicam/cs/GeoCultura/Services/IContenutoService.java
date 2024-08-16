package it.unicam.cs.GeoCultura.Services;

import it.unicam.cs.GeoCultura.Model.Evento;
import it.unicam.cs.GeoCultura.Model.Itinerario;
import it.unicam.cs.GeoCultura.Model.PuntoDiInteresse;

import java.awt.*;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public interface IContenutoService {
    PuntoDiInteresse creaNuovoPuntoDiInteresse(PuntoDiInteresse puntoDiInteresse);
    Itinerario creaNuovoItinerario (Itinerario itinerario);
    Evento creaNuovoEvento(Evento evento);
    List<Evento> getAllEventi();
    List<Itinerario> getAllItinerari();
    List<PuntoDiInteresse> getAllPoi();
    Evento getEvento(int id);
    Itinerario getItinerario(int id);
    PuntoDiInteresse getPoi(int id);
}
