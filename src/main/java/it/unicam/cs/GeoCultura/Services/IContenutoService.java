package it.unicam.cs.GeoCultura.Services;

import it.unicam.cs.GeoCultura.Model.Evento;
import it.unicam.cs.GeoCultura.Model.Itinerario;
import it.unicam.cs.GeoCultura.Model.PuntoDiInteresse;

public interface IContenutoService {

    PuntoDiInteresse creaNuovoPuntoDiInteresse(PuntoDiInteresse puntoDiInteresse);
    Itinerario creaNuovoItinerario (Itinerario itinerario);
    Evento creaNuovoEvento(Evento evento);
}
