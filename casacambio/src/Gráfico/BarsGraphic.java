/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico;

/**
 *
 * @author Caroline
 */

import java.awt.Dimension;
import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

// Criação do gráfico do projeto por Caroline 165921

public class BarsGraphic extends JFrame{

public BarsGraphic(String title) {
super(title);
CategoryDataset dataset = BarsGraphic.createDataset();
JFreeChart chart = BarsGraphic.createBarChart(dataset);
ChartPanel panel = new ChartPanel(chart);
panel.setPreferredSize(new Dimension(500, 400));
setContentPane(panel);
}

public static CategoryDataset createDataset() {
DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//Valor aleatórios para testes
dataset.addValue(5.10, "Compra", "Agosto");
dataset.addValue(3.20, "Venda", "Agosto");
dataset.addValue(4.50, "Compra", "Setembro");
dataset.addValue(4.10, "Venda", "Outubro");
dataset.addValue(3.80, "Venda", "Agosto");
dataset.addValue(3.75, "Venda", "Setembro");
dataset.addValue(3.45, "Compra", "Outubro");
dataset.addValue(3.50, "Compra", "Agosto");
dataset.addValue(4.20, "Compra", "Setembro");
return dataset; 
}

public static JFreeChart createBarChart(CategoryDataset dataset) {
JFreeChart chart = ChartFactory.createBarChart(
"Dólar", //Titulo
"Meses", // Eixo X
"Cotação Média", //Eixo Y
dataset, // Dados para o grafico
PlotOrientation.VERTICAL, //Orientacao do grafico
true, false, false); // exibir: legendas, tooltips, url
return chart;
}

public static void main( String[] args ) {
BarsGraphic chart = new BarsGraphic("Teste Cotação");
chart.pack();
chart.setVisible(true);
}
}