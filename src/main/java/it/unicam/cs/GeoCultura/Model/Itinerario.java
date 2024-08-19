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

    public Itinerario(String nome, String descrizione, Date dataCreazione, int IdCreatore, int livelloDifficolta) {
        super(nome, descrizione, dataCreazione, IdCreatore);
        this.livelloDifficolta = livelloDifficolta;
        this.contenuti = new ArrayList<>();
    }
    public TipoContenuto getTipoContenuto(){
        return TipoContenuto.ITINERARIO;
    }
}
