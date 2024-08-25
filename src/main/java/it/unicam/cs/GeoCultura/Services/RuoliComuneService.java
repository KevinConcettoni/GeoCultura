package it.unicam.cs.GeoCultura.Services;

import it.unicam.cs.GeoCultura.Model.RuoloUtente;
import it.unicam.cs.GeoCultura.Model.RuoloUtenteComune;
import it.unicam.cs.GeoCultura.Repositories.RuoliComuneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuoliComuneService implements IRuoliComuneService{
    private final RuoliComuneRepository ruoliComuneRepository;
    private final ComuneService comuneService;

    public RuoliComuneService(RuoliComuneRepository ruoliComuneRepository, ComuneService comuneService) {
        this.ruoliComuneRepository = ruoliComuneRepository;
        this.comuneService = comuneService;
    }
    @Override
    public RuoloUtenteComune creaNuovoRuolo(RuoloUtenteComune ruoloComune) {
        for (RuoloUtenteComune r : ruoliComuneRepository.findAll()) {
            if (r.getComune().equals(ruoloComune.getComune()) && r.getUtente().equals(ruoloComune.getUtente()))
                throw new IllegalArgumentException(("L'utente ha già questo ruolo all'intero del comune"));
        }
        return ruoliComuneRepository.save(ruoloComune);
    }

    public RuoloUtente getRuolo(Integer utenteId, Integer comuneId) {
        List<RuoloUtenteComune> roles = ruoliComuneRepository.cercaRuoliPerId(utenteId);

        for (RuoloUtenteComune i : roles) {
            if (i.getComune().getID().equals(comuneId)) {
                comuneService.getById(comuneId);

                return i.getRuolo();
            }
        }

        throw new IllegalArgumentException("L'utente non ha un ruolo in questo comune");
    }

    public void setRuolo(Integer UtenteId, Integer comuneId, RuoloUtente ruoloUtente) {
        List<RuoloUtenteComune> roles = ruoliComuneRepository.cercaRuoliPerId(UtenteId);

        for (RuoloUtenteComune i : roles) {
            if (i.getComune().getID().equals(comuneId)) {
                // throw if the townHall does not exist
                comuneService.getById(comuneId);

                i.setRuolo(ruoloUtente);
                ruoliComuneRepository.save(i);
                return;
            }
        }

        throw new IllegalArgumentException("L'utente non ha un ruolo in questo comune");
    }
}
