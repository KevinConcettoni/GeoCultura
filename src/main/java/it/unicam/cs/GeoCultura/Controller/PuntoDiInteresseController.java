package it.unicam.cs.GeoCultura.Controller;

import it.unicam.cs.GeoCultura.Model.PuntoDiInteresse;
import it.unicam.cs.GeoCultura.Services.ContenutoService;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class PuntoDiInteresseController implements IController<PuntoDiInteresse, Integer>{

    private final ContenutoService contenutoService;

    public PuntoDiInteresseController(ContenutoService contenutoService) {
        this.contenutoService = contenutoService;
    }
    @Override
    public ResponseEntity<PuntoDiInteresse> crea(PuntoDiInteresse entity) {
        PuntoDiInteresse nuovoPuntoDiInteresse = contenutoService.creaNuovoPuntoDiInteresse(entity);
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
    public ResponseEntity<?> modifica(PuntoDiInteresse entity) {
        contenutoService.modificaPoi(entity);
        return ResponseEntity.ok("{}");
    }

    @Override
    public ResponseEntity<?> elimina(Integer aLong) {
        return null;//TODO Da Implementare
    }
}
