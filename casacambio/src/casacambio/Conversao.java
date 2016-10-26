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
    
        /* Operacoes matematicas ... Caroline Resende */
    
    /* SOBRECARGA de METODOS */
    public float mediaCompra (float x1, float x2) {
        return (x1+x2)/2;
    }
    
    public float mediaVenda (float x1, float x2) {
        return (x1+x2)/2;
    }
    
    public float mediaCompra (float x1, float x2, float x3) {
        return (x1+x2+x3)/3;
    }
    
    public float mediaVenda (float x1, float x2, float x3) {
        return (x1+x2+x3)/3;
    }
    
    /* FUNCAO COM LISTA DE ARGUMENTOS DE COMPRIMENTO VARIAVEL - MEDIA */
    public float mediaVenda(float... x){
        float media=0;
        
        for(float valor: x){
            media +=valor;
        }
        
        return media/x.length;
    }

    public float mediaCompra(float... x){
        float media=0;
        
        for(float valor: x){
            media +=valor;
        }
        
        return media/x.length;
    }
    
    // Desenvolvimento MAIORCOTACAO e MENORCOTACAO a partir de array
    // @author Caroline
    
     public float maiorCotacao (float[] array) {
        float max = 0.0f;//aqui a variável max recebe o valor do primeiro item do array  
          for (int i = 1; i < array.length; i++) {//aqui a iteração irá ocorrer  
             if (array[i] > max){ //caso o valor da posição i seja maior que o valor de max, max será substituído pelo valor da i-ésima posição.  
                 max = array[i]; 
             }
          }  
          return max;
    }
          
    public float menorCotacao (float[] array) {
        float minimo = 0.0f;//aqui a variável max recebe o valor do primeiro item do array  
          for (int i = 1; i < array.length; i++) {//aqui a iteração irá ocorrer  
             if (array[i] < minimo){ //caso o valor da posição i seja maior que o valor de max, max será substituído pelo valor da i-ésima posição.  
                 minimo = array[i]; 
             }
          }  
          return minimo;
    }
    
}
