package it.unicam.cs.GeoCultura.Model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
@Entity
public class PuntoDiInteresse extends Contenunto {
    private CategoriaPOI categoria;
    @Embedded
    private Posizione posizione;

    public PuntoDiInteresse(String nome, String descrizione, Date dataCreazione, int IdCreatore, CategoriaPOI categoria,
                            Posizione posizione) {
        super(nome, descrizione, dataCreazione, IdCreatore);
        this.categoria = categoria;
        this.posizione = posizione;
    }
    public TipoContenuto getTipoContenuto(){
        return TipoContenuto.PUNTO_DI_INTERESSE;
    }
}
