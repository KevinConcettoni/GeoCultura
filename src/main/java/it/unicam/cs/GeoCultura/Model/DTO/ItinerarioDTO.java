package it.unicam.cs.GeoCultura.Model.DTO;

import it.unicam.cs.GeoCultura.Model.Itinerario;

import java.util.Date;
import java.util.List;

public class ItinerarioDTO extends ContenutoDTO{
    private int livelloDifficolta;
    private List<Integer> contenuti;

    public ItinerarioDTO(String nome, String descrizione, Date dataCreazione,
                         Integer creatore, Integer comune, int livelloDifficolta, List<Integer> contenuti) {
        super(nome, descrizione, dataCreazione, creatore, comune);
        this.livelloDifficolta = livelloDifficolta;
        this.contenuti = contenuti;
    }

    public Itinerario toItinerario(){
        return new Itinerario(this.getNome(),
                this.getDescrizione(),
                this.getDataCreazione(),
                this.getCreatore(),
                this.livelloDifficolta,
                this.getComune(),
                this.contenuti);
    }

    public int getLivelloDifficolta() {
        return livelloDifficolta;
    }
    public List<Integer> getContenuti() {
        return contenuti;
    }
}
