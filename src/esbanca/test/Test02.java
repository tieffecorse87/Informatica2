/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esbanca.test;

import utils.Banca;

/**
 *
 * @author Fabio7
 */
public class Test02 {
    
    public static void main(String [] args){
    
        Banca b = new Banca("UBI", 5);
        b.aggiungiConto("TGLFBA87D24L690F");
        b.getConti("IT00000UBI000");
    }
    
    
    
}



