package it.unicam.cs.GeoCultura.Services;

import it.unicam.cs.GeoCultura.Model.RuoloUtenteComune;
import it.unicam.cs.GeoCultura.Repositories.RuoliComuneRepository;
import org.springframework.stereotype.Service;

@Service
public class RuoliComuneService implements IRuoliComuneService{
    private final RuoliComuneRepository ruoliComuneRepository;

    public RuoliComuneService(RuoliComuneRepository ruoliComuneRepository) {
        this.ruoliComuneRepository = ruoliComuneRepository;
    }
    @Override
    public RuoloUtenteComune creaNuovoRuolo(RuoloUtenteComune ruoloComune) {
        for (RuoloUtenteComune r : ruoliComuneRepository.findAll()) {
            if (r.getComune().equals(ruoloComune.getComune()) && r.getUtente().equals(ruoloComune.getUtente()))
                throw new IllegalArgumentException(("L'utente ha già questo ruolo all'intero del comune"));
        }
        return ruoliComuneRepository.save(ruoloComune);
    }
}
