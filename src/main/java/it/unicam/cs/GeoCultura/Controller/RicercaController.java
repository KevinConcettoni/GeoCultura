package it.unicam.cs.GeoCultura.Controller;

import it.unicam.cs.GeoCultura.Model.*;
import it.unicam.cs.GeoCultura.Services.RicercaService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/ricerca")
public class RicercaController {
    private final RicercaService ricercaService;
    public RicercaController(RicercaService ricercaService) {
        this.ricercaService = ricercaService;
    }
    // TODO: gestione tipo contenuto e formato date
    @GetMapping("/contenuto")
    public List<Contenuto> ricercaContenuto (@RequestParam String nome,
                                             @RequestParam String descrizione,
                                             @RequestParam Date dataCreazione,
                                             @RequestParam String tipo){
        return ricercaService.ricercaContenuto(nome, descrizione, dataCreazione, tipo);
    }

    @GetMapping("/itinerario")
    public List<Itinerario> ricercaItinerario(@RequestParam String nome,
                                              @RequestParam String descrizione,
                                              @RequestParam Date dataCreazione,
                                              @RequestParam int livelloDifficolta){
        return ricercaService.ricercaItinerario(nome, descrizione,dataCreazione,livelloDifficolta);
    }

    @GetMapping("/contest")
    public List<Contest> ricercaContest(@RequestParam String nome,
                                        @RequestParam Date dataInizio,
                                        @RequestParam Date dataFine,
                                        @RequestParam String tipo) {
        return ricercaService.ricercaContest(nome, dataInizio, dataFine, tipo);
    }

    @GetMapping("/poi")
    public List<PuntoDiInteresse> ricercaPuntDiInteresse(@RequestParam String nome,
                                                         @RequestParam String descrizione,
                                                         @RequestParam CategoriaPOI categoria,
                                                         @RequestParam Posizione posizione) {
        return ricercaService.ricercaPuntoDiInteresse(nome, descrizione, categoria, posizione);
    }

    @GetMapping("/evento")
    public List<Evento> ricercaEvento(@RequestParam String nome,
                                      @RequestParam String descrizione,
                                      @RequestParam Date dataInizio,
                                      @RequestParam Date dataFine) {
        return ricercaService.ricercaEvento(nome, descrizione, dataInizio, dataFine);
    }

    //TODO: aggiungere ricerca utenti

}
