package it.unicam.cs.GeoCultura.Services;

import it.unicam.cs.GeoCultura.Model.RuoloUtenteComune;

public interface IRuoliComuneService {
    /**
     * Crea un nuovo ruolo per un utente all'interno di un comune
     * @return il nuovo ruolo dell'utente all'interno del comune
     */
    RuoloUtenteComune creaNuovoRuolo(RuoloUtenteComune ruoloComune);
}
