package controllers;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import abstracts.DatoGara;
import entities.SfidaTecnologica;
import entities.SfidaTecnologica.Difficolta;
import entities.Squadra;
import entities.Zona;
import interfaces.DataReader;

public class FileDataReader implements DataReader {

	
	private static ArrayList<DatoGara> leggiDatoGara(String sezioneFile) {
		
	        ArrayList<DatoGara> datiGara = new ArrayList<>();

	        try (BufferedReader br = new BufferedReader(new FileReader("traccia_A.txt"))) {
	            String linea;
	            while ((linea = br.readLine()) != null) {
	                if (linea.equals("###")) {
	                    continue;
	                
	                }

	                String[] elementi = linea.split(",");

	   
	                if (elementi.length == 2) {
	                    datiGara.add(new Zona(elementi[0], elementi[1]));
	                } else if (elementi.length > 3) {
	                	
	                    ArrayList<String> membri = new ArrayList<>();
	                    for (int i = 2; i < elementi.length - 1; i++) {
	                        membri.add(elementi[i]);
	                    }
	                    
	                    datiGara.add(new Squadra(elementi[0], Integer.parseInt(elementi[1]), membri, elementi[elementi.length - 1]));
	                } else if (elementi.length == 5) {
	                    Difficolta difficolta = Difficolta.valueOf(elementi[3].toUpperCase());
	                    datiGara.add(new SfidaTecnologica(elementi[0], elementi[1], elementi[2], difficolta, Integer.parseInt(elementi[4])));
	                } else {
	                    System.err.println("Formato dati non supportato: " + String.join(",", elementi));
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return datiGara;
	    }
    
	 public static void init() {
	        try {
	            Scanner fileInput = new Scanner(
	                    new FileInputStream("traccia_A.txt")
	            );
	            fileInput.useDelimiter("###");
	            String[] sezioniFile = new String[3];
	            int i = 0;
	            while(fileInput.hasNext()) {
	                sezioniFile[i] = fileInput.next();
	                i++;
	            }
	            leggiDatoGara(sezioniFile[0]);
	            leggiDatoGara(sezioniFile[1]);
	            leggiDatoGara(sezioniFile[2]);
	        } catch(FileNotFoundException e) {
	            System.out.println("Non ho trovato il file!");
	        }
	    }
	
	
}
	
	

