package entities;

import abstracts.DatoGara;

public class SfidaTecnologica extends DatoGara {
	
	
	 public enum Difficolta {
	        BASSA,
	        MEDIA,
	        ALTA
	    }
	 
	private String zonaSfida;
    private String oggettoSfida;
    private Difficolta difficoltaSfida;
    private int puntiSfida;
   
    

    public SfidaTecnologica(String nome, String zonaSfida, String oggettoSfida, Difficolta difficoltaSfida, int puntiSfida) {
        super(nome);
        this.zonaSfida = zonaSfida;
        this.oggettoSfida = oggettoSfida;
        this.difficoltaSfida = difficoltaSfida;
        this.puntiSfida = puntiSfida;
    }
    
    public Difficolta getDifficolta() {return difficoltaSfida;}
}
