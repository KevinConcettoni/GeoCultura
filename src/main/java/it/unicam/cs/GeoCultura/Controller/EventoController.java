package it.unicam.cs.GeoCultura.Controller;

import it.unicam.cs.GeoCultura.Model.Evento;
import it.unicam.cs.GeoCultura.Services.ContenutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/evento")
public class EventoController implements IController<Evento, Integer> {
    private final ContenutoService contenutoService;

    public EventoController(ContenutoService contenutoService) {
        this.contenutoService = contenutoService;
    }
    @Override
    public ResponseEntity<Evento> crea(Evento entity) {
        Evento nuovoEvento = contenutoService.creaNuovoEvento(entity);
        return ResponseEntity.ok(nuovoEvento);
    }

    @Override
    public ResponseEntity<Evento> getById(Integer id) {
        return ResponseEntity.ok(contenutoService.getEvento(Math.toIntExact(id))); //Da rivedere
    }

    @Override
    public ResponseEntity<List<Evento>> getAll() {
        return ResponseEntity.ok(contenutoService.getAllEventi());
    }

    @Override
    public ResponseEntity<?> modifica(Evento  entity) {
        contenutoService.updateEvent(entity);
        return ResponseEntity.ok("{}");
    }

    @Override
    public ResponseEntity<?> elimina(Integer aLong) {
        return null;//TODO Da Implementare
    }
}
