package it.unicam.cs.GeoCultura.Services;

import it.unicam.cs.GeoCultura.Model.Evento;
import it.unicam.cs.GeoCultura.Model.Itinerario;
import it.unicam.cs.GeoCultura.Model.PuntoDiInteresse;
import it.unicam.cs.GeoCultura.Repositories.EventoRepository;
import it.unicam.cs.GeoCultura.Repositories.ItinerarioRepository;
import it.unicam.cs.GeoCultura.Repositories.PuntoDiInteresseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ContenutoService implements IContenutoService{
    private final ItinerarioRepository itinerarioRepository;
    private final PuntoDiInteresseRepository puntoDiInteresseRepository;
    private final EventoRepository eventoRepository;

    public ContenutoService(ItinerarioRepository itinerarioRepository, PuntoDiInteresseRepository puntoDiInteresseRepository, EventoRepository eventoRepository) {
        this.itinerarioRepository = itinerarioRepository;
        this.puntoDiInteresseRepository = puntoDiInteresseRepository;
        this.eventoRepository = eventoRepository;
    }
    @Override
    public PuntoDiInteresse creaNuovoPuntoDiInteresse(PuntoDiInteresse puntoDiInteresse) {
        return puntoDiInteresseRepository.save(puntoDiInteresse);
    }

    @Override
    public Itinerario creaNuovoItinerario(Itinerario itinerario) {
        return itinerarioRepository.save(itinerario);
    }

    @Override
    public Evento creaNuovoEvento(Evento evento) {
        return eventoRepository.save(evento);
    }

    @Override
    public List<Evento> getAllEventi() {
        return StreamSupport.stream(eventoRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public List<Itinerario> getAllItinerari() {
        return StreamSupport.stream(itinerarioRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public List<PuntoDiInteresse> getAllPoi() {
        return StreamSupport.stream(puntoDiInteresseRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
