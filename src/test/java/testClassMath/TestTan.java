/**
 * <b>Type de test:</b>
 * Test notre fonction tan pour certaines valeurs dans un intervalle parametré 
 * <br><br>
 * <b>Paramètre:</b>
 * Régler l'intervalle de calcul (xmin, xmax) ainsi que le pas
 * <br><br>
 * <b>Sortie:</b>
 * FAILED si la précision est inférieur à 0.001
 * PASSED sinon
 */

public class TestTan {
    public static void main(String[] args) {
        MathP m= new MathP();

        /*--------Réglage de l'affichage et des valeurs----------*/
        float pas= 0.1f;
        float xmin= 0.0f;
        float xmax= 3f;
        /*--------Fin de réglage de l'affichage et des valeurs----------*/

        for(float i=xmin; i<xmax; i+=pas){
            if (m._abs((float)(m.tan_cordic1(i)-Math.tan(i)))<0.001){
                System.out.println("tan(" + i + ")="+ m.tan_cordic1(i)+ " : PASSED");
            }
            else{
                System.out.println("tan(" + i + ")="+ m.tan_cordic1(i)+ " : FAILLED");
            }
       
        }
    }
}
