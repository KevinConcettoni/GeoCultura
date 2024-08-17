package it.unicam.cs.GeoCultura.Services;

import it.unicam.cs.GeoCultura.Model.Comune;
import it.unicam.cs.GeoCultura.Repositories.ComuneRepository;
import org.springframework.stereotype.Service;

@Service
public class ComuneService implements IComuneService {

    private final ComuneRepository comuneRepository;
    public ComuneService(ComuneRepository comuneRepository) {
        this.comuneRepository = comuneRepository;
    }

    @Override
    public Comune creaComune(Comune comune) {
        return comuneRepository.save(comune);
    }
}
