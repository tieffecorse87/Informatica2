/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Fabio
 */
public class Conto {

    private String iban;
    private String cf;
    private double saldo;

    public Conto(String iban, String cf) {
        this.iban = iban;
        this.cf = cf;
    }

    
    public boolean deposita(double importo){
        if(importo > 0){
            saldo+=importo;
             System.out.println("saldo:" + saldo);
            return true;
        }else{
            System.out.println("importo sbagliato");
            return false;
        }
    }
    
    public boolean  preleva(double importo){
        
        if(importo >= 0 && importo <= saldo){
            
            saldo-=importo;
            System.out.println("saldo:" + saldo);
            return true;
        }else{
            
            System.out.println("importo prelevato sbagliato");
            return false;
        }
    }
    
    
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
        
}
