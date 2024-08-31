package it.unicam.cs.GeoCultura.Model.DTO;

import it.unicam.cs.GeoCultura.Model.CategoriaPOI;
import it.unicam.cs.GeoCultura.Model.Posizione;
import it.unicam.cs.GeoCultura.Model.PuntoDiInteresse;

import java.util.Date;
import java.util.List;

public class PuntoDiInteresseDTO extends ContenutoDTO{
    private CategoriaPOI categoria;
    private Posizione posizione;

    public PuntoDiInteresseDTO(String nome, String descrizione, Date dataCreazione,
                         Integer creatore, Integer comune, CategoriaPOI categoria, Posizione posizione) {
        super(nome, descrizione, dataCreazione, creatore, comune);
        this.categoria = categoria;
        this.posizione = posizione;
    }
    public PuntoDiInteresseDTO(){

    }
    public PuntoDiInteresse toPuntoDiInteresse(){
        return new PuntoDiInteresse(
                this.getNome(),
                this.getDescrizione(),
                this.getDataCreazione(),
                this.getCreatore(),
                this.categoria,
                this.posizione,
                this.getComune()
        );
    }

    public CategoriaPOI getCategoria() {
        return categoria;
    }

    public Posizione getPosizione() {
        return posizione;
    }
}
