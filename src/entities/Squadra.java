package entities;

import java.util.ArrayList;

import abstracts.DatoGara;

public class Squadra extends DatoGara{

	private int punteggio;
    private ArrayList<String> listaMembri;
    private String tipoZonaAppartenenza;

    public Squadra(String nome, int punteggio, ArrayList<String> listaMembri, String tipoZonaAppartenenza) {
        super(nome);
        this.punteggio = punteggio;
        this.listaMembri = listaMembri;
        this.tipoZonaAppartenenza = tipoZonaAppartenenza;
    }
    
}
