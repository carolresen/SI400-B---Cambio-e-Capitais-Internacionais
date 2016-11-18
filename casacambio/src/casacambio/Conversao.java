/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casacambio;

/**
 *
 * @author Marcos
 */
public class Conversao {
    private double valor;
    private double taxaDolar = 3.2;
    private double taxaEuro = 3.6;

    public double getValor() { 
          return valor; 
    } 

    public void setValor(double valor) { 
        this.valor = valor; 
    }
    
    public void converterMoeda (int moedaInicial, double valor) {
        double convertido;
      
        if (moedaInicial == 0) {
            convertido = this.valor * taxaDolar;
            this.valor = convertido;
        } 
        
        if (moedaInicial == 1) {
            convertido = this.valor * taxaEuro;
            this.valor = convertido;
        }
        
  
    }
    
}
