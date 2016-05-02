package org.predict.kap2;

import java.util.Arrays;

import org.apache.commons.math3.distribution.EnumeratedIntegerDistribution;
import org.junit.Test;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.Styler.LegendPosition;

public class Aufallh�ufigkeiten {

	int[] ausfallzeitenPr�flinge = new int[] { 171, 189, 207, 225, 243, 261, 279 };
	double[] ausfallh�ufigkeit = new double[] { 0.0, 0.11, 0.22, 0.33, 0.22, 0.11, 0.0 };

	@Test
	public void generateAusfallzeitenPr�flinge() throws Exception {
		EnumeratedIntegerDistribution dist = new EnumeratedIntegerDistribution(ausfallzeitenPr�flinge, ausfallh�ufigkeit);
		
			// Create Chart
			CategoryChart chart = new CategoryChartBuilder().width(800).height(600).title("Score Histogram")
					.xAxisTitle("Score").yAxisTitle("Number").build();

			// Customize Chart
			chart.getStyler().setLegendPosition(LegendPosition.InsideNW);
			chart.getStyler().setPlotContentSize(1.0);
			
			int[] sample = dist.sample(1000);
			
			System.out.println(Arrays.asList(sample));
			
			// Series
			//chart.addSeries("test 1", ausfallzeitenPr�flinge, ausfallh�ufigkeit);

			// Show it
			//new SwingWrapper(chart).displayChart();

			Thread.sleep(2000);
		}

}
