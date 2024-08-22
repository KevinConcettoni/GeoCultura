package it.unicam.cs.GeoCultura.Services;

import it.unicam.cs.GeoCultura.Model.*;
import it.unicam.cs.GeoCultura.Repositories.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import java.util.Optional;

@Service
public class ContenutoService implements IContenutoService{
    private final ItinerarioRepository itinerarioRepository;
    private final PuntoDiInteresseRepository puntoDiInteresseRepository;
    private final EventoRepository eventoRepository;
    private final UtenteRepository utenteRepository;
    private final ComuneRepository comuneRepository;
    private final RuoliComuneRepository ruoliComuneRepository;

    public ContenutoService(ItinerarioRepository itinerarioRepository, PuntoDiInteresseRepository puntoDiInteresseRepository, EventoRepository eventoRepository, UtenteRepository utenteRepository, ComuneRepository comuneRepository, RuoliComuneRepository ruoliComuneRepository) {
        this.itinerarioRepository = itinerarioRepository;
        this.puntoDiInteresseRepository = puntoDiInteresseRepository;
        this.eventoRepository = eventoRepository;
        this.utenteRepository = utenteRepository;
        this.comuneRepository = comuneRepository;
        this.ruoliComuneRepository = ruoliComuneRepository;
    }

    private StatoApprovazione approvazioneDefault(RuoloUtente ruolo) {
        return switch (ruolo) {
            case GESTORE_PIATTAFORMA, ANIMATORE, CURATORE,CONTRIBUTOR_AUTORIZZATO -> StatoApprovazione.APPROVATO;
            default -> StatoApprovazione.PENDING;
        };
    }

    private Optional<StatoApprovazione> approvazioneDefaultUtente(Integer id, Integer comuneID) {
        Utente utente = utenteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Errore: l'utente non esiste"));

        comuneRepository.findById(comuneID).
                orElseThrow(() -> new IllegalArgumentException("Errore: il comune non esiste"));

        List<RuoloUtenteComune> ruoli = ruoliComuneRepository.cercaRuolo(id);//TODO Implementare cercaRuolo
        for (RuoloUtenteComune ruolo : ruoli) {
            if (ruolo.getComune().getID().equals(comuneID)) {
                return Optional.of(approvazioneDefault(ruolo.getRuolo()));
            }
        }

        return Optional.empty();
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

    @Override
    public Evento getEvento(int id) {
        return eventoRepository.findById(id).orElse(null);
    }

    @Override
    public Itinerario getItinerario(int id) {
        return itinerarioRepository.findById(id).orElse(null);
    }

    @Override
    public PuntoDiInteresse getPoi(int id) {
        return puntoDiInteresseRepository.findById(id).orElse(null);
    }

    @Override
    public void modificaEvento(Evento event) {
        eventoRepository.save(event);
    }

    @Override
    public void modificaPoi(PuntoDiInteresse puntoDiInteresse) {
        puntoDiInteresseRepository.save(puntoDiInteresse);
    }

    @Override
    public void modificaItinerario(Itinerario itinerario) {
        itinerarioRepository.save(itinerario);
    }

}
