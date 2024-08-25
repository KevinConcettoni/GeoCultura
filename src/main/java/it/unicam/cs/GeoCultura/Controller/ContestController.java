package it.unicam.cs.GeoCultura.Controller;

import it.unicam.cs.GeoCultura.Model.Contest;
import it.unicam.cs.GeoCultura.Model.Utente;
import it.unicam.cs.GeoCultura.Services.ContestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contest")
public class ContestController implements IController<Contest, Integer> {
    private final ContestService contestService;

    public ContestController(ContestService contestService) {
        this.contestService = contestService;
    }

    @Override//TODO Fixare
    public ResponseEntity<Contest> crea (@RequestBody Contest contest, List<Integer> contenuti)
    {
        Contest newContest = contestService.creaContest(contest,contenuti);
        return ResponseEntity.ok(newContest);
    }

    @Override
    public ResponseEntity<?> getById(Integer integer) {
        return null;//TODO Da Implementare
    }

    @Override
    public ResponseEntity<?> getAll() {
        return null;//TODO Da Implementare
    }

    @Override
    public ResponseEntity<?> modifica(Contest entity) {
        return null;//TODO Da Implementare
    }

    @Override
    public ResponseEntity<?> elimina(Integer integer) {
        return null;//TODO Da Implementare
    }
}
