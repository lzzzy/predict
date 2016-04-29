package org.predict;

import java.util.Arrays;

import org.junit.Test;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.style.Styler.LegendPosition;

public class XChartTests {

	@Test
	public void oneLineChart() throws Exception {

		double[] xData = new double[] { 0.0, 1.0, 2.0 };
		double[] yData = new double[] { 2.0, 1.0, 0.0 };

		// Create Chart
		XYChart chart = QuickChart.getChart("Sample Chart", "X", "Y", "y(x)", xData, yData);

		// Show it
		new SwingWrapper(chart).displayChart();

		Thread.sleep(2000);
	}

	@Test
	public void barChart() throws Exception {

		// Create Chart
		CategoryChart chart = new CategoryChartBuilder().width(800).height(600).title("Score Histogram")
				.xAxisTitle("Score").yAxisTitle("Number").build();

		// Customize Chart
		chart.getStyler().setLegendPosition(LegendPosition.InsideNW);
		chart.getStyler().setPlotContentSize(1.0);

		// Series
		chart.addSeries("test 1", Arrays.asList(new Integer[] { 0, 1, 2, 3, 4 }),
				Arrays.asList(new Integer[] { 4, 5, 9, 6, 5 }));
		chart.addSeries("test 2", Arrays.asList(new Integer[] { 0, 1, 2, 3, 4 }),
				Arrays.asList(new Integer[] { 8, 5, 4, 6, 5 }));

		// Show it
		new SwingWrapper(chart).displayChart();

		Thread.sleep(2000);
	}

}
