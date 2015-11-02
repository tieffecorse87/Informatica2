/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Fabio7
 */
public class Banca {
    
    private String nome;
    private int nCcMax;
    private Conto[] conti;
    private int contiInseriti;
    private String IBAN;

    public Banca(String nome, int nCcMax) {
        this.nome = nome;
        this.conti = new Conto[nCcMax];
        IBAN = "IT00000" +nome+"000";
        contiInseriti=0;
    }

    public Conto aggiungiConto(String cf){
        if(contiInseriti < conti.length){
            String iban = IBAN +(contiInseriti + 1);
            Conto c = new Conto(iban, cf);
            conti[contiInseriti++]= c;
            return c;
        }else{
        
        return null;
        } 
    }
    
    public Conto getConti(String iban) {
        
        for (int i = 0; i < contiInseriti; i++) {
            if(conti[i].getIban().equals(iban)){
                return conti[i];
            }
        }
        return null;
    }
  
     public String toString() {
        String s = "\nBanca " + nome + "\n";
        s += "------------\n";
        s += contiInseriti + " conti attivi\n";
        s += "------------\n";
        for (int i = 0; i < contiInseriti; i++) {
            s += conti[i].toString() + "\n";
        }
        s += "------------\n";
        return s + "\n";
    }
    
}
