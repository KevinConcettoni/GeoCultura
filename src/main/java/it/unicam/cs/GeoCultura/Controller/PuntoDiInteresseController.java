package it.unicam.cs.GeoCultura.Controller;

import it.unicam.cs.GeoCultura.Model.DTO.PuntoDiInteresseDTO;
import it.unicam.cs.GeoCultura.Model.PuntoDiInteresse;
import it.unicam.cs.GeoCultura.Services.ContenutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/poi")
public class PuntoDiInteresseController implements IController<PuntoDiInteresseDTO, Integer>{
    private final ContenutoService contenutoService;

    public PuntoDiInteresseController(ContenutoService contenutoService) {
        this.contenutoService = contenutoService;
    }
    @Override
    public ResponseEntity<PuntoDiInteresse> crea(PuntoDiInteresseDTO puntoDiInteresse) {
        PuntoDiInteresse nuovoPuntoDiInteresse = contenutoService.creaNuovoPuntoDiInteresse(
                puntoDiInteresse.toPuntoDiInteresse());
        return ResponseEntity.ok(nuovoPuntoDiInteresse);
    }
    @Override
    public ResponseEntity<PuntoDiInteresse> getById(Integer id) {
        return ResponseEntity.ok(contenutoService.getPoi(Math.toIntExact(id)));
    }

    @Override
    public ResponseEntity<List<PuntoDiInteresse>> getAll() {
        return ResponseEntity.ok(contenutoService.getAllPoi());
    }

    @Override
    public ResponseEntity<?> modifica(PuntoDiInteresseDTO puntoDiInteresse, Integer id) {
        contenutoService.modificaPoi(puntoDiInteresse.toPuntoDiInteresse());
        return ResponseEntity.ok("{}");
    }

    @Override
    public ResponseEntity<?> elimina(@PathVariable("id") Integer id) {

        return ResponseEntity.badRequest().body("Non Implementato");
    }
}
