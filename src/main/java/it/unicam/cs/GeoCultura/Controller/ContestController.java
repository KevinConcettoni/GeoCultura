package it.unicam.cs.GeoCultura.Controller;

import it.unicam.cs.GeoCultura.Model.Contest;
import it.unicam.cs.GeoCultura.Model.DTO.ContestDTO;
import it.unicam.cs.GeoCultura.Model.Utente;
import it.unicam.cs.GeoCultura.Services.ContestService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contest")
public class ContestController implements IController<ContestDTO, Integer> {
    private final ContestService contestService;

    public ContestController(ContestService contestService) {
        this.contestService = contestService;
    }

    @Override
    public ResponseEntity<Contest> crea (@Valid ContestDTO contest)
    {
        Contest newContest = contestService.creaContest(contest.toContest(), contest.getContenuti());
        return ResponseEntity.ok(newContest);
    }

    @Override
    public ResponseEntity<?> getById(@PathVariable("id")Integer id) {
        return ResponseEntity.ok(contestService.getContest(id));
    }

    @Override
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(contestService.getAllContest());
    }

    @Override
    public ResponseEntity<?> modifica(@Valid ContestDTO contestDTO, Integer id) {
        Contest cont = contestDTO.toContest();
        cont.setID(id);

        this.contestService.modificaContest(cont, contestDTO.getContenuti());
        return ResponseEntity.ok("{}");
    }
    @Override
    public ResponseEntity<?> elimina(@PathVariable("id") Integer id) {
        return ResponseEntity.badRequest().body("Non Implementato");
    }
    @PutMapping("/iscrizione/{idContest}")
    public ResponseEntity<?> iscrizioneContest(@PathVariable Integer idContenuto,
                                               @RequestBody Integer idContest){
        contestService.iscrizioneContenuto(idContenuto, idContest);
        return ResponseEntity.ok("");
    }

    @PutMapping("/chiusura/{idContest}")
    public ResponseEntity<?> chiusuraContest(@PathVariable Integer idContest, @RequestBody Integer idContenutoVincitore) {
        contestService.chiusuraContest(idContest, idContenutoVincitore);

        return ResponseEntity.ok("{}");
    }
}
