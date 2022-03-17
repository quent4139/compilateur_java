/**¨
 * <b>Type de test:</b>
 * Test si l'ulp est bien égal à celui de la classe math
 * <br><br>
 * <b>Sortie:</b>
 * PASSED: L'ulp est équivalent à celui de la classe Math 
 * FAILED: L'ulp est different de celui de la classe Math 
 */

public class testUlp {
    public static void main(String[] args) {
        MathD m = new MathD();
        for (float i=0; i<10000; i+=0.01f){
            if (m.ulp(i)==Math.ulp(i)){
                // System.out.println("Valeur : "+ i + " ULP= "+ m.ulp(i)+ " PASSED");
            }
            else{
                System.out.println("Valeur obtenu: " + m.ulp(i));
                System.out.println("Valeur attendue: "+ (float)Math.ulp(i));
                System.out.println("Valeur : "+ i + " ULP= "+ m.ulp(i)+ " FAILED");
        }
        }
    }
}
