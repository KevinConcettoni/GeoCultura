package it.unicam.cs.GeoCultura.Model;

import java.util.Date;

public class PuntoDiInteresse extends Content{
    private CategoriaPOI categoria;
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
