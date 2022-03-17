// /*
// Type de test: 
// Test graphiquement nos fonctions cos, sin, atan... à l'aide de la bibliothèque graphique java jFreeShart

// Paramètre:
// Régler l'intervalle d'affichage ainsi que la fonction à tracer (cos, sin, asin...) dans la partie 
// "réglage de l'affichage et des valeurs"

// Sortie:
// Graphique de notre fonction ainsi que de celui de la classe Math (devraient se superposer)
// */


// import java.lang.Math;
// import javax.swing.JFrame;
// import org.jfree.chart.ChartFactory;
// import org.jfree.chart.ChartPanel;
// import org.jfree.chart.JFreeChart;
// import org.jfree.chart.plot.PlotOrientation;
// import org.jfree.data.xy.XYDataset;
// import org.jfree.data.xy.XYSeries;
// import org.jfree.data.xy.XYSeriesCollection;

// public class TestGraphique extends JFrame {

//    private static final long serialVersionUID = 1L;

//    public TestGraphique(String applicationTitle, String chartTitle) {
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

//     /*-------------Réglage de l'affichage et des valeurs-------------*/
//     MathD m= new MathD();
//     float xmin1=0f;
//     float xmax1= 20f;
//     float pas1 = 0.001f;
//     float ymin1 = -50f;
//     float ymax1= 30f;
//     String s="sqrt";
//     /*-------------Fin de réglage de l'affichage et des valeurs---------*/
  
//    private XYDataset createDataset() {
//       final XYSeries fctPrs = new XYSeries(s+": perso");
//          float val1;
//          for (float i=xmin1; i<xmax1; i+=pas1){
//             switch(s){
//                case "cos":
//                   val1=m.cos(i);
//                   break;
//                case "sin":
//                   val1=m.sin(i);
//                   break;
//                case "atan":
//                   val1=m.atan(i);
//                   break;
//                case "acos":
//                   val1=m.acos(i);
//                   break;
//                case "sqrt":
//                   val1=MathP._sqrt(i);
//                   break;
//                default: 
//                   val1= m.cos(i);
//                   break;
//             }
//             if (val1>ymin1 && val1<ymax1){
//                fctPrs.add(i, val1);
//             }
//          }

//          final XYSeries fctAutre = new XYSeries(s+": class math");
//             float val2;
//             for (float i=xmin1; i<xmax1; i+=pas1){
//                switch(s){
//                   case "cos":
//                      val2= (float)Math.cos(i);
//                      break;
//                   case "sin":
//                      val2= (float)Math.sin(i);
//                      break;
//                   case "sqrt":
//                      val2= (float)Math.sqrt(i);
//                      break;
//                   case "acos":
//                      val2= (float)Math.acos(i);
//                      break;
//                   case "asin":
//                      val2= (float)Math.asin(i);
//                      break;
//                   case "atan":
//                      val2= (float)Math.atan(i);
//                      break;
//                   default: 
//                      val2= (float)Math.cos(i);
//                      break;
//                }
//                if (val2>ymin1 && val2<ymax1){
//                   fctAutre.add(i, val2);
//                }
//             }

//             // final XYSeries diff = new XYSeries(s+": delta");
//             // float val3;
//             // for (float i=xmin1; i<xmax1; i+=pas1){
//             //    switch(s){
//             //       case "cos":
//             //          val3=m.cos(i)-(float)Math.cos(i);
//             //          break;
//             //       case "sin":
//             //          val3=m.sin(i)-(float)Math.sin(i);
//             //          System.out.println(val3);
//             //          break;
//             //       case "atan":
//             //          val3=m.atan(i) -(float)Math.atan(i);
//             //          break;
//             //       case "acos":
//             //          val3=m.acos(i)-(float)Math.acos(i);
//             //          break;
//             //       case "sqrt":
//             //          val3=MathP._sqrt(i)-(float)Math.sqrt(i);
//             //          break;
//             //       default: 
//             //          val3= m.cos(i)-(float)Math.tan(i);
//             //          break;
//             //    }
//             //    if (val3>ymin1 && val3<ymax1){
//             //       fctPrs.add(i, val3);
//             //    }
//             // }
//             final XYSeriesCollection dataset = new XYSeriesCollection();
//             dataset.addSeries(fctAutre);
//             dataset.addSeries(fctPrs);
//             // dataset.addSeries(diff);
//             return dataset;
//   }

//    public static void main(String[] args) {
//       TestGraphique chart = new TestGraphique("Browser Usage Statistics", "Fonction trigo");
//       chart.pack();
//       chart.setVisible(true);
//    }
// }
