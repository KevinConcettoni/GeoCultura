package it.unicam.cs.GeoCultura.Controller;

import it.unicam.cs.GeoCultura.Model.DTO.UtenteDTO;
import it.unicam.cs.GeoCultura.Model.Utente;
import it.unicam.cs.GeoCultura.Services.UtenteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/utenti")
public class UtenteController implements IController<UtenteDTO, Integer> {
    private final UtenteService utenteService;

    public UtenteController(UtenteService utenteService) {
        this.utenteService = utenteService;
    }

    @Override
    public ResponseEntity<?> crea(UtenteDTO utente)
    {
        Utente nuovoUtente= utenteService.creaUtente(utente.toUtente(), utente.getComune(), utente.getRuolo());
        return ResponseEntity.ok(nuovoUtente);
    }
    @Override
    public ResponseEntity<?> getAll()
    {
        return ResponseEntity.ok(utenteService.getAll());
    }

    @Override
    public ResponseEntity<?> modifica(UtenteDTO entity) {
        return null;//TODO Da Implementare
    }

    @Override
    public ResponseEntity<?> elimina(Integer integer) {
        return null;//TODO Da Implementare
    }

    @Override
    public ResponseEntity<?> getById(@PathVariable("ID") Integer ID)
    {
        return ResponseEntity.ok(utenteService.getUtente(ID));
    }

}
