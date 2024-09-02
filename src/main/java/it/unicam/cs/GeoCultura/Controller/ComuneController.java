package it.unicam.cs.GeoCultura.Controller;

import it.unicam.cs.GeoCultura.Model.Comune;
import it.unicam.cs.GeoCultura.Model.DTO.ComuneDTO;
import it.unicam.cs.GeoCultura.Model.Utente;
import it.unicam.cs.GeoCultura.Services.ComuneService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comune")
public class ComuneController implements  IController<ComuneDTO, Integer>{
    private final ComuneService comuneService;

    public ComuneController(ComuneService comuneService) {
        this.comuneService = comuneService;
    }
    @Override
    public ResponseEntity<?> crea(@RequestBody ComuneDTO comune) {
        Comune nuovoComune= comuneService.creaComune(comune.toComune());
        return ResponseEntity.ok(nuovoComune);
    }
    @Override
    public ResponseEntity<?> getById(Integer id) {
        return ResponseEntity.ok(comuneService.getAll());
    }

    @Override
    public ResponseEntity<?> getAll() {

        return ResponseEntity.ok(comuneService.getAll());
    }

    @Override
    public ResponseEntity<?> modifica(ComuneDTO comune, Integer id) {

        return ResponseEntity.ok(comuneService.modificaComune(comune.toComune(),id));
    }

    @Override
    public ResponseEntity<?> elimina(@PathVariable("id") Integer id) {
        comuneService.elimina(id);
        return ResponseEntity.ok("{}");
    }
}
