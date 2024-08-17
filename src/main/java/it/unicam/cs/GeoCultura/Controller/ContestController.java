package it.unicam.cs.GeoCultura.Controller;

import it.unicam.cs.GeoCultura.Model.Contest;
import it.unicam.cs.GeoCultura.Services.ContestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contest")
public class ContestController {
    private final ContestService contestService;

    public ContestController(ContestService contestService) {
        this.contestService = contestService;
    }

    @PostMapping("/aggiungi")
    public ResponseEntity<Contest> creaContest (@RequestBody Contest contest)
    {
        Contest newContest = contestService.creaContest(contest);
        return ResponseEntity.ok(newContest);
    }
}
