/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casacambio;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Victória
 */
public class Moeda implements Serializable{

    String data;
    String tipo;
    String valorCompra;
    String valorVenda;

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public void setData(String data)
    {
        this.data = data;
    }
    public void setCompra(String valorCompra)
    {
        this.valorCompra = valorCompra;
    }
    public void setVenda(String valorVenda)
    {
        this.valorVenda = valorVenda;
    }
    
    //Operacoes matematicas ... Caroline Resende
    
    // SOBRECARGA de METODOS
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
    
    // FUNCAO COM LISTA DE ARGUMENTOS DE COMPRIMENTO VARIAVEL - MEDIA
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
        
}