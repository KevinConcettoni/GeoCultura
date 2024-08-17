package it.unicam.cs.GeoCultura.Controller;

import it.unicam.cs.GeoCultura.Model.Comune;
import it.unicam.cs.GeoCultura.Services.ComuneService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coumune")
public class ComuneController {
    private final ComuneService comuneService;

    public ComuneController(ComuneService comuneService) {
        this.comuneService = comuneService;
    }

    @PostMapping("/aggiungi")
    public ResponseEntity<?> creaComune(@RequestBody Comune comune) {
        Comune nuovoComune= comuneService.creaComune(comune);
        return ResponseEntity.ok(nuovoComune);
    }
}
