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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
            moeda.setData(converterSC(line[0]));
            moeda.setTipo(line[3]);
            moeda.setCompra(Double.parseDouble(substituir(line[4])));
            moeda.setVenda(Double.parseDouble(substituir(line[5])));
            cotacao.add(moeda);
            System.out.println(moeda.data+", "+moeda.tipo+ ", "+ moeda.valorCompra+", "+moeda.valorVenda);
        }
        reader.close();
        source.close();
       
    }
        public void mostrarCotacao()
    {
        
    }    
        public Calendar converterSC(String data)
        {   
            Calendar c = null;
            try {
 
                SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");    
                c = Calendar.getInstance();
                c.setTime(formatoData.parse(data));
 
                } 
            catch (Exception e) {}
                   return c;
        }
        public String converterCS(Calendar data)
        {
           String retorno = "";
           try {
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
            Calendar hoje = data;
            retorno = formatoData.format(hoje.getTime());
            System.out.println(retorno);
            } catch (Exception e) {}
           return retorno;
        }
        
        public String substituir(String a)
        {
            a.replace(",",".");
            return a;
        }
}
