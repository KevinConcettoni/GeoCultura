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
    @PostMapping("/aggiungi/itinerario")
    public ResponseEntity<Itinerario> creaItinerario(@RequestBody Itinerario itinerario) {
        Itinerario nuovoItinerario = contenutoService.creaNuovoItinerario(itinerario);
        return ResponseEntity.ok(nuovoItinerario);
    }
    @PostMapping("/aggiungi/evento")
    public ResponseEntity<Evento> creaEvento(@RequestBody Evento evento) {
        Evento nuovoEvento = contenutoService.creaNuovoEvento(evento);
        return ResponseEntity.ok(nuovoEvento);
    }
    @PostMapping("/add/poi")
    public ResponseEntity<PuntoDiInteresse> creaPoi(@RequestBody PuntoDiInteresse puntoDiInteresse) {
        PuntoDiInteresse nuovoPoi = contenutoService.creaNuovoPuntoDiInteresse(puntoDiInteresse);
        return ResponseEntity.ok(nuovoPoi);
    }
    @GetMapping("/getAll/poi")
    public ResponseEntity<List<PuntoDiInteresse>> getAllPoi(){
        return ResponseEntity.ok(contenutoService.getAllPoi());
    }
    @GetMapping("/getAll/eventi")
    public ResponseEntity<List<Evento>> getAllEventi(){
        return ResponseEntity.ok(contenutoService.getAllEventi());
    }
    @GetMapping("/getAll/itinerari")
    public ResponseEntity<List<Itinerario>> getAllItinerari(){
        return ResponseEntity.ok(contenutoService.getAllItinerari());
    }
    @GetMapping("/get/itinerary/{id}")
    public ResponseEntity<Itinerario> getItinerary(@PathVariable int id) {
        return ResponseEntity.ok(contenutoService.getItinerario(id));
    }
    @GetMapping("/get/event/{id}")
    public ResponseEntity<Evento> getEvent(@PathVariable int id) {
        return ResponseEntity.ok(contenutoService.getEvento(id));
    }
    @GetMapping("/get/poi/{id}")
    public ResponseEntity<PuntoDiInteresse> getPoi(@PathVariable int id) {
        return ResponseEntity.ok(contenutoService.getPoi(id));
    }
}
