package it.unicam.cs.GeoCultura.Model.DTO;

import it.unicam.cs.GeoCultura.Model.RuoloUtente;

public class CambioRuoloDTO {
    Integer comuneId;
    RuoloUtente nuovoRuolo;
    Integer idUtente;

    public CambioRuoloDTO(RuoloUtente nuovoRuolo, Integer comuneId, Integer idUtente) {
        this.nuovoRuolo = nuovoRuolo;
        this.comuneId = comuneId;
        this.idUtente = idUtente;
    }

    public RuoloUtente getNuovoRuolo() {
        return nuovoRuolo;
    }

    public Integer getComuneId() {
        return comuneId;
    }

    public Integer getIdUtente() {
        return idUtente;
    }
}
