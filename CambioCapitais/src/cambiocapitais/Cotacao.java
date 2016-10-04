/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambiocapitais;

import java.util.Date;

/**
 *
 * @author Victória
 */
public class Cotacao {
    String moeda;
    Date data;
    double valorCompra;
    double valorVenda;

    public void lerCotacao()
    {
        
    }
    
    public void mostrarCotacao()
    {
    }    
    
    //Operacoes matematicas ... Caroline Resende
    
    // SOBRECARGA de METODOS
    float mediaCompra (float x1, float x2) {
        return (x1+x2)/2;
    }
    
    float mediaVenda (float x1, float x2) {
        return (x1+x2)/2;
    }
    
    float mediaCompra (float x1, float x2, float x3) {
        return (x1+x2+x3)/3;
    }
    
     float mediaVenda (float x1, float x2, float x3) {
        return (x1+x2+x3)/3;
    }
    
}
