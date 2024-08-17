package it.unicam.cs.GeoCultura.Controller;

import it.unicam.cs.GeoCultura.Model.Utente;
import it.unicam.cs.GeoCultura.Services.UtenteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/utenti")
public class UtenteController implements IController<Utente, Integer> {
    private final UtenteService utenteService;

    public UtenteController(UtenteService utenteService) {
        this.utenteService = utenteService;
    }

    @PostMapping("/aggiungi")
    public ResponseEntity<?> crea(@RequestBody Utente utente)
    {
        Utente nuovoUtente= utenteService.creaUtente(utente);
        return ResponseEntity.ok(nuovoUtente);
    }
    @GetMapping("/getAll")
    public ResponseEntity<?> getAll()
    {
        return ResponseEntity.ok(utenteService.listaUtenti());
    }

    @Override
    public ResponseEntity<?> modifica(Utente entity) {
        return null;//TODO Da Implementare
    }

    @Override
    public ResponseEntity<?> elimina(Integer integer) {
        return null;//TODO Da Implementare
    }

    @GetMapping("/getById")
    public ResponseEntity<?> getById(@PathVariable("ID") Integer ID)
    {
        return ResponseEntity.ok(utenteService.getUtente(ID));
    }

}
