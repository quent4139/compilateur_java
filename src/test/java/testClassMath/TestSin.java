/**
 * <b>Type de test: </b>
 * Test de nombres de bits d'écart entre la valeur attendue de sin(x) et celle calculée.
 * <br><br>
 * <b>Paramètre:</b>
 * L'intervalle sur lesquels on souhaite calculer la précision de notre fonction sinus 
 * <br><br>
 * <b>Sortie:</b>
 * Nombre de bits d'écart moyen entre les valeurs attendues et celles obtenus
*/

public class TestSin {
    public static void main(String[] args) {
        /*-------Choix de l'intervalle-----------*/
        float xmin=0;
        float xmax=10;
        float pas=0.1f;
        /*-------Fin du choix de l'intervalle-----------*/
        
        EcartReel e= new EcartReel();
        float moyenne;        
        moyenne= (float)e.moyenneNbBitsEcarts(pas, xmin,xmax, "sin");
        System.out.println("Sur l'intervalle ["+xmin+","+xmax+"] le nombre de bits moyen d'écart est : "+moyenne);
        }
}

