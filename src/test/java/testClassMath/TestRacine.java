import java.lang.Math;

/**
 * <b>Type de test:</b> 
 * Test de nombres de l'écart entre la valeur attendue de sqrt(x) et celle calculée.
 *<br><br>
 * <b>Paramètre:</b>
 * L'intervalle sur lesquels on souhaite calculer la précision de notre fonction sinus 
 *<br><br>
 * <b>Sortie:</b> 
 * PASSED si précision supérieur à 10^-6
 *FAILED si précision inferieur à 10^-6
 */
public class TestRacine {
    public static void main(String[] args) {
        float n;
        /*-------Choix de l'intervalle-----------*/
        float xmin=0;
        float xmax=20;
        float pas=0.01f;
        /*-------Fin du choix de l'intervalle-----------*/

        for (n=xmin; n<xmax; n=n+pas){
            System.out.print("sqrt("+n+")="+ MathP._sqrt(n));
            if (MathP._sqrt(n)- Math.sqrt(n)<0.000001){
                System.out.println(" : PASSED");
            }
            else{
                System.out.println(" :FAILLED");
            }
        }
    }
    
}
