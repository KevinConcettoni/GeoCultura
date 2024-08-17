package it.unicam.cs.GeoCultura.Controller;

import it.unicam.cs.GeoCultura.Model.Utente;
import it.unicam.cs.GeoCultura.Services.UtenteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/utenti")
public class UtenteController {
    private final UtenteService utenteService;

    public UtenteController(UtenteService utenteService) {
        this.utenteService = utenteService;
    }

    @PostMapping("/aggiungi")
    public ResponseEntity<?> creaUtente(@RequestBody Utente utente)
    {
        Utente nuovoUtente= utenteService.creaUtente(utente);
        return ResponseEntity.ok(nuovoUtente);
    }
    @GetMapping("/getAll")
    public ResponseEntity<?> getAllUtenti()
    {
        return ResponseEntity.ok(utenteService.listaUtenti());
    }

    @GetMapping("/getUtente")
    public ResponseEntity<?> getUtente(@PathVariable("ID") Integer ID)
    {
        return ResponseEntity.ok(utenteService.getUtente(ID));
    }

}
