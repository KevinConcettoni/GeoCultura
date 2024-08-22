package it.unicam.cs.GeoCultura.Controller;

import it.unicam.cs.GeoCultura.Model.DTO.ItinerarioDTO;
import it.unicam.cs.GeoCultura.Model.Itinerario;
import it.unicam.cs.GeoCultura.Services.ContenutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/itinerario")
public class ItinerarioController implements IController<ItinerarioDTO, Integer> {
    private final ContenutoService contenutoService;

    public ItinerarioController(ContenutoService contenutoService) {
        this.contenutoService = contenutoService;
    }
    @Override
    public ResponseEntity<Itinerario> crea(ItinerarioDTO itinerario) {
        Itinerario nuovoItinerario = contenutoService.creaNuovoItinerario(itinerario.toItinerario(), itinerario.getContenuti());
        return ResponseEntity.ok(nuovoItinerario);
    }

    @Override
    public ResponseEntity<Itinerario> getById(Integer id) {
        return ResponseEntity.ok(contenutoService.getItinerario(Math.toIntExact(id))); //Da rivedere
    }

    @Override
    public ResponseEntity<List<Itinerario>> getAll() {
        return ResponseEntity.ok(contenutoService.getAllItinerari());
    }

    @Override
    public ResponseEntity<?> modifica(ItinerarioDTO entity) {
        contenutoService.modificaItinerario(entity.toItinerario());
        return ResponseEntity.ok("{}");
    }

    @Override
    public ResponseEntity<?> elimina(Integer aLong) {
        return null;//TODO Da Implementare
    }
}
