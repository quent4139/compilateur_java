import java.lang.Math;

/**
 * 
 * <b>Type de test:</b> 
 * Tester le résultat d'un cosinus ou d'un sinus en hexadécimal 
 * <br> <br>
 * <b>Sortie:</b>
 * La valeur hexa du résultat obtenu avec nos fonctions et le résultat avec les fonctions de la classe Math.h
 */

public class TestValeurSimple {
    public static void main(String[] args) {
        MathD m = new MathD();
        float valeur= 2e18f;

        float a=m.atan(valeur);
        float b= (float)Math.atan(valeur);

        int valIntA=Float.floatToIntBits(a);
        int valIntB= Float.floatToIntBits(b);

        String hexaA= Integer.toHexString(valIntA);
        String hexaB= Integer.toHexString(valIntB);

        System.out.println("\nPerso: "+ a+"="+hexaA);
        System.out.println("Math : " +b+"="+hexaB+ "\n");


        /*-----------Brouillon---------------*/
        // float d= -1256.1f;
        // String s= "cos";
        // float resPerso=m.cos_cordic1(d);
        // double resMath=Math.cos(d);

        // String iResPerso=Double.toHexString(resPerso);
        // String iResMath=Double.toHexString(resMath);
        
        // //if (cinqEmeHexa1.equals(cinqEmeHexa2)){
        // System.out.println("\n"+d+ ": ");
        // System.out.println("Decimal: ");
        // System.out.println("Perso:"+s+"("+d+")="+resPerso);
        // System.out.println("Math :"+s+"("+d+")="+resMath+"");
        // System.out.println("Hexa: ");
        // System.out.println("Perso: "+s+"("+d+")="+iResPerso);
        // System.out.println("Math : "+s+"("+d+")="+iResMath+"");

        // //Affichage du seul caractère qui diverge
        // String cinqEmeHexa1= iResPerso.substring(8,9);
        // String cinqEmeHexa2= iResMath.substring(8,9);
        // System.out.println("Perso: "+s+"("+d+")="+cinqEmeHexa1);
        // System.out.println("Math : "+s+"("+d+")="+cinqEmeHexa2+"\n");
                
                    }
            }




    
    
    
