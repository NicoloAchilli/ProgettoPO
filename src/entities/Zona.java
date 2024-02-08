package entities;

import abstracts.DatoGara;

public class Zona extends DatoGara{

	private String tipoZona;

    public Zona(String nome, String tipoZona) {
        super(nome);
        this.tipoZona = tipoZona;
    }
    
    public String getTipoZona() {
    	return tipoZona;
    }
}
