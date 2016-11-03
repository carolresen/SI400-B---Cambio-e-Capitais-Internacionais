/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico;

import javax.swing.JFrame;
 
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author Caroline
 */
public class Grafico extends JFrame {
 
	private static final long serialVersionUID = 1L;
 
	public static void main(String[] args) {
		Grafico demo = new Grafico("Cotação do dólar", "Média");
		demo.pack();
		demo.setVisible(true);
	}
 
	public Grafico(String applicationTitle, String chartTitle) {
		super(applicationTitle);
		PieDataset origemDados = carregarDados();
		JFreeChart grafico = criarGrafico(origemDados, chartTitle);
		ChartPanel chartPanel = new ChartPanel(grafico);
		chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
		setContentPane(chartPanel);
 
	}
 
       
        /**
	 * Carregamento dos dados
	 */
 
	private PieDataset carregarDados() {
		// Geração de dados aleatórios
		double valor1 = 4.65;
		double valor2 = 3.92;
		double valor3 = 3.89;
 
		DefaultPieDataset result = new DefaultPieDataset();
		result.setValue("Agosto", valor1);
		result.setValue("Setembro", valor2);
		result.setValue("Outubro", valor3);
		return result;
	}
 
	/**
	 * Criação do gráfico
	 * */
 
	private JFreeChart criarGrafico(PieDataset origemDados, String titulo) {
 
		JFreeChart chart = ChartFactory.createPieChart3D(titulo, origemDados, true, // Adicionar
																					// Lengenda
				true, false);
 
		PiePlot3D plot = (PiePlot3D) chart.getPlot();
		plot.setStartAngle(290);
		plot.setDirection(Rotation.CLOCKWISE);
		plot.setForegroundAlpha(0.5f);
		return chart;
	}
 
}

// Caroline 165921