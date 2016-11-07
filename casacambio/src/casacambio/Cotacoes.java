/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casacambio;

import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Victória
 */
public class Cotacoes {
    Collection<Moeda>cotacao;
    public Cotacoes()
    {
        cotacao = new ArrayList();
    }
    public void lerCotacao(URL url) throws IOException
    {
       
        Reader source = new InputStreamReader(url.openStream()); 
        CSVReader reader = new CSVReader(source, ';');
        String[] line;
        while ((line = reader.readNext()) != null) {
            Moeda moeda = new Moeda();
            moeda.setData(line[0]);
            moeda.setTipo(line[1]);
            moeda.setCompra(line[2]);
            moeda.setVenda(line[3]);
            
            cotacao.add(moeda);
            System.out.println(cotacao);
        }
        reader.close();
        source.close();
    }
        public void mostrarCotacao()
    {
        
    }    

}
