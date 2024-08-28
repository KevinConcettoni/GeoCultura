package it.unicam.cs.GeoCultura.Services;

import it.unicam.cs.GeoCultura.Model.Contenuto;
import it.unicam.cs.GeoCultura.Model.Contest;
import it.unicam.cs.GeoCultura.Model.RuoloUtente;
import it.unicam.cs.GeoCultura.Repositories.ContenutoRepository;
import it.unicam.cs.GeoCultura.Repositories.ContestRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ContestService implements IContestService{

    private final ContestRepository contestRepository;
    private final RuoliComuneService ruoliComuneService;
    private final ComuneService comuneService;
    private final UtenteService utenteService;
    private final ContenutoRepository contenutoRepository;

    public ContestService(ContestRepository contestRepository, RuoliComuneService ruoliComuneService, ComuneService comuneService, UtenteService utenteService, ContenutoService contenutoService, ContenutoRepository contenutoRepository) {
        this.contestRepository = contestRepository;
        this.ruoliComuneService = ruoliComuneService;
        this.comuneService = comuneService;
        this.utenteService = utenteService;
        this.contenutoRepository = contenutoRepository;
    }

    @Override
    public Contest creaContest(Contest contest, List<Integer> contenuti) {

        if (contest == null)
        {
            throw new IllegalArgumentException("Errore: contest nullo");
        }

        if (ruoliComuneService.getRuolo(contest.getCreatore().getID(), contest.getComune().getID())
                != RuoloUtente.ANIMATORE) {
            throw new IllegalStateException("Errore: Devi essere un animatore");
        }

        contest.setComune(comuneService.getById
                (contest.getComune().getID()));
        contest.setCreatore(utenteService.getUtente(contest.getCreatore().getID()));

        contenuti.forEach(c -> {
            contest.iscrizione(contenutoRepository.findById(c)
                    .orElseThrow(() -> new IllegalArgumentException("Errore: il contenuto non esiste ")));
        });

        return contestRepository.save(contest);
    }

    @Override
    public Contest getContest(Integer id) {
        return this.contestRepository.findById(id).orElse(null);
    }

    @Override
    public List<Contest> getAllContest() {
        return StreamSupport.stream(contestRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public void modificaContest(Contest contest, List<Integer> contenuti) {
        if (contest == null) {
            throw new IllegalArgumentException("Errore: Contest Nullo");
        }

        Contest original = contestRepository.findById(contest.getID())
                .orElseThrow(() -> new IllegalArgumentException("Errore: Contest non esiste"));

        for (Integer id : contenuti)
        {
            Contenuto cont = this.contenutoRepository.findById(id)
                    .orElseThrow(() -> new IllegalArgumentException("Errore: Contest non esiste"));
            contest.getContenuti().add(cont);
        }

        contest.setComune(original.getComune());
        contest.setCreatore(original.getCreatore());

        contestRepository.save(contest);
    }

    @Override
    public void iscrizioneContenuto(Integer idContenuto, Integer idContest) {
        Contest contest = contestRepository.findById(idContest)
                .orElseThrow(() -> new IllegalArgumentException("Errore: il contest non esiste"));

        Contenuto content = contenutoRepository.findById(idContenuto)
                .orElseThrow(() -> new IllegalArgumentException("Errore: il contenuto non esiste"));

        contest.iscrizione(content);
        contestRepository.save(contest);
    }

    @Override
    public void chiusuraContest(Integer idContest, Integer IdContenutoVincitore) {

    }
}
