import javax.swing.JFrame;


// import org.jfree.chart.ChartFactory;
// import org.jfree.chart.ChartPanel;
// import org.jfree.chart.JFreeChart;
// import org.jfree.chart.plot.PlotOrientation;
// import org.jfree.data.xy.XYDataset;
// import org.jfree.data.xy.XYSeries;
// import org.jfree.data.xy.XYSeriesCollection;

// public class traceEcart extends JFrame {
//     public traceEcart(String applicationTitle, String chartTitle) {
//         super(applicationTitle);

//         // based on the dataset we create the chart
//         JFreeChart pieChart = ChartFactory.createXYLineChart(chartTitle, "Category", "Score", createDataset(),PlotOrientation.VERTICAL, true, true, false);

//         // Adding chart into a chart panel
//         ChartPanel chartPanel = new ChartPanel(pieChart);
      
//         // settind default size
//         chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
      
//         // add to contentPane
//         setContentPane(chartPanel);
//     }

//     /*-------------Réglage de l'affichage-------------*/
//     MathP m= new MathP();
//     float xmin1=0;
//     float xmax1= 10;
//     float pas1 = 1f;
//     float ymin1 = -9f;
//     float ymax1= 16f;
//     String s="cos";
//     /*-------------Fin de réglage de l'affichage---------*/
  
//    private XYDataset createDataset() {
//       final XYSeries ecart = new XYSeries(s+": écart");
//          float val1;
//          for (float i=xmin1; i<xmax1; i+=pas1){
//             EcartReel e= new EcartReel();
//             // String hexResPerso="";
//             // String hexResMath="";
//             // //Calcule du cosinus(i) qu'on stocke sous forme d'entier 
//             // //L'entier est equivalent au float sur 32 bits avec la norme IEE754
//             // int valIntA=Float.floatToIntBits(m.cos_cordic1(i));
//             // int valIntB= Float.floatToIntBits((float)Math.cos(i));
//             // //Conversion de 
//             // hexResPerso= Integer.toHexString(valIntA);
//             // hexResMath= Integer.toHexString(valIntB);
//             // // System.out.println("Hex: cos("+i + ")="+hexResPerso+"");
//             // // System.out.println("Hex: cos("+i + ")="+hexResMath+"");
//             val1= (float)e.moyenneNbBitsEcarts(0.1f, 0,i, "cos"); 

//             if (val1>ymin1 && val1<ymax1){
//                ecart.add(i, val1);
//             }
//          }  
//         final XYSeriesCollection dataset = new XYSeriesCollection();
//         // dataset.addSeries(fctAutre);
//         // dataset.addSeries(fctPrs);
//         dataset.addSeries(ecart);
//         return dataset;
//         }

//         public static void main(String[] args) {
//             traceEcart chart = new traceEcart("Browser Usage Statistics", "Moyenne précision fonction atan");
//             chart.pack();
//             chart.setVisible(true);
//             }
// }
