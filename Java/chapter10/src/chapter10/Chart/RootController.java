package chapter10.Chart;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;


public class RootController implements Initializable {
	@FXML private PieChart pieChart;
	@FXML private BarChart barChart;
	@FXML private AreaChart areaChart;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
//		������Ʈ ObserverbleList ����Ÿ�Է°� ����-> ������Ʈ.setData(����Ʈ)
		ObservableList<PieChart.Data>pieChartList=FXCollections.observableArrayList();
		pieChartList.add(new PieChart.Data("AWT", 10));
		pieChartList.add(new PieChart.Data("SWing", 20));
		pieChartList.add(new PieChart.Data("SWT", 30));
		pieChartList.add(new PieChart.Data("JAVAFX", 40));		
		pieChart.setData(pieChartList);
		
//		����Ʈ-> ObserverbleList(XYChart.Data) 
		ObservableList<XYChart.Data>barChartList=FXCollections.observableArrayList();
		barChartList.add(new XYChart.Data("2015",10));
		barChartList.add(new XYChart.Data("2016",30));
		barChartList.add(new XYChart.Data("2017",20));
		barChartList.add(new XYChart.Data("2018",40));
		XYChart.Series series1= new XYChart.Series();
		series1.setName("����");
		series1.setData(barChartList);
		barChart.getData().add(series1);
		
		ObservableList<XYChart.Data>barChartList2=FXCollections.observableArrayList();
		barChartList2.add(new XYChart.Data("2015",30));
		barChartList2.add(new XYChart.Data("2016",10));
		barChartList2.add(new XYChart.Data("2017",40));
		barChartList2.add(new XYChart.Data("2018",20));
		XYChart.Series series2= new XYChart.Series();
		series2.setName("����");
		series2.setData(barChartList2);
		barChart.getData().add(series2);
		
		
//		����� ��Ʈ
		ObservableList<XYChart.Data>barChartList3=FXCollections.observableArrayList();
		barChartList3.add(new XYChart.Data("2015",30));
		barChartList3.add(new XYChart.Data("2016",10));
		barChartList3.add(new XYChart.Data("2017",40));
		barChartList3.add(new XYChart.Data("2018",20));
		XYChart.Series series3= new XYChart.Series();
		series3.setName("��տµ�");
		series3.setData(barChartList3);
		areaChart.getData().add(series3);
		
	}//end of initialize

}
