/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crunchify.jsp.servlet;



//import Modelo.panelesConAlimento;
import edu.co.sergio.mundo.dao.Visitas_tecnicasDao;
import edu.co.sergio.mundo.vo.Visitas_Tecnicas;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;


public class ChartServlet1 extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        String idColmena = request.getParameter("idPanel");
        response.setContentType("image/png");
        OutputStream outputStream = response.getOutputStream();
        JFreeChart chart = createChart();
        int width = 500;
        int height = 350;
        ChartUtilities.writeChartAsPNG(outputStream, chart, width, height);

    }
  
    private JFreeChart createChart() {
        DefaultPieDataset dataset = new DefaultPieDataset();
//        Visitas_tecnicasDao c=new Visitas_tecnicasDao();
//        ArrayList<Visitas_Tecnicas> arr=new ArrayList();
//        arr=(ArrayList<Visitas_Tecnicas>) c.findAll();
        
        
        dataset.setValue("One",43.2);
        dataset.setValue("Two", 10.0);
        dataset.setValue("Three", 27.5);
        dataset.setValue("Four", 17.5);
        dataset.setValue("Five", 11.0);
        dataset.setValue("Six", 19.4);
        
        JFreeChart chart = ChartFactory.createPieChart(
            "Porcentaje de paneles con Alimentos",  // chart title
            dataset,             // dataset
            true,                // include legend
            true,
            false
        );
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setNoDataMessage("No data available");
        plot.setExplodePercent(1, 0.30);
       
        return chart;
    }
    
  


}
