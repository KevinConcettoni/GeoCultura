package it.unicam.cs.GeoCultura.Controller;

import it.unicam.cs.GeoCultura.Model.Evento;
import it.unicam.cs.GeoCultura.Model.Itinerario;
import it.unicam.cs.GeoCultura.Model.PuntoDiInteresse;
import it.unicam.cs.GeoCultura.Services.ContenutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contenuto")
public class ContenutoController {
    private final ContenutoService contenutoService;
    public ContenutoController(ContenutoService contenutoService) {
        this.contenutoService = contenutoService;
    }
    @PutMapping("/approva/poi/{id}")
    public ResponseEntity<?> approvaPuntoDiInteresse(@PathVariable Integer id, @RequestBody Integer idUtente){
        if (contenutoService.verificaRuoliApprovazione(id, idUtente))
            return ResponseEntity.badRequest().body("Non hai i permessi per approvare il contenuto");
        contenutoService.approvaPuntoDiInteresse(id);
        return ResponseEntity.ok().body("");
    }

    @PutMapping("/approva/itinerario/{id}")
    public ResponseEntity<?> approvaItinerario(@PathVariable Integer id, @RequestBody Integer idUtente)
    {
        if (contenutoService.verificaRuoliApprovazione(id, idUtente))
            return ResponseEntity.badRequest().body("Non hai i permessi per approvare il contenuto");
        contenutoService.approvaItinerario(id);
        return ResponseEntity.ok().body("");
    }
}


