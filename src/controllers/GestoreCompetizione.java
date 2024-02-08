package controllers;

import java.util.ArrayList;

import entities.SfidaTecnologica;
import entities.Squadra;

public class GestoreCompetizione {
	
	private ArrayList<Squadra> squadrePartecipanti;
    private ArrayList<SfidaTecnologica> sfideTecnologiche;

    public GestoreCompetizione(ArrayList<Squadra> squadrePartecipanti, ArrayList<SfidaTecnologica> sfideTecnologiche) {
        this.squadrePartecipanti = squadrePartecipanti;
        this.sfideTecnologiche = sfideTecnologiche;
    }
}
