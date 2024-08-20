package it.unicam.cs.GeoCultura.Services;

import it.unicam.cs.GeoCultura.Model.Comune;
import it.unicam.cs.GeoCultura.Repositories.ComuneRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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

    @Override
    public List<Comune> getAll() {
        return StreamSupport.stream(comuneRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
