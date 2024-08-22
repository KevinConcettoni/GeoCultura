package it.unicam.cs.GeoCultura.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
public class Itinerario extends Contenuto {

    private int livelloDifficolta;
    @ManyToMany
    private List<Contenuto> contenuti;

    public Itinerario(String nome, String descrizione, Date dataCreazione, int IdCreatore, int livelloDifficolta,Integer comune) {
        super(nome, descrizione, dataCreazione, IdCreatore);
        this.livelloDifficolta = livelloDifficolta;
        this.contenuti = new ArrayList<>();
        this.comune =new Comune();
        this.comune.setID(comune);
    }
    public TipoContenuto getTipoContenuto(){
        return TipoContenuto.ITINERARIO;
    }

    public List<Contenuto> getContenuti() {
        return contenuti;
    }
}
