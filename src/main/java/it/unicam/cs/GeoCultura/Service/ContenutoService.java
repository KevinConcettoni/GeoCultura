package it.unicam.cs.GeoCultura.Service;

import it.unicam.cs.GeoCultura.Repositories.ItinerarioRepository;
import it.unicam.cs.GeoCultura.Repositories.PuntoDiInteresseRepository;
import org.springframework.stereotype.Service;

@Service
public class ContenutoService implements IContenutoService{
    private final ItinerarioRepository itinerarioRepository;
    private final PuntoDiInteresseRepository puntoDiInteresseRepository;
    //aggiungere repository evento

    public ContenutoService(ItinerarioRepository itinerarioRepository, PuntoDiInteresseRepository puntoDiInteresseRepository) {
        this.itinerarioRepository = itinerarioRepository;
        this.puntoDiInteresseRepository = puntoDiInteresseRepository;
    }
}
