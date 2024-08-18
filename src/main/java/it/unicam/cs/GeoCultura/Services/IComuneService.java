package it.unicam.cs.GeoCultura.Services;

import it.unicam.cs.GeoCultura.Model.Comune;

public interface IComuneService {
    /**
     * Crea un nuovo comune
     * @param comune il comune da creare
     * @return il nuoco comune aggiunto al repository
     */
    Comune creaComune(Comune comune);
}
