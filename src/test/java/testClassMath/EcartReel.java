/**
 * <b>Rôle de la classe:  </b>
 * Implémenter des méthodes permettant de trouver le nombre de bits d'écarts entre un flottant qu'on souhaiterai avoir et celui qu'on obtient 
 *<br><br>
 * <b>Sortie:</b>
 * Nombre de bits d'écart moyen entre les valeurs attendues et celles obtenus
 */

public class EcartReel {

    public EcartReel() {
    }
    
    /**
     * Retourne la moyenne du nombre de bits d'écart pour une fonction trigonométrique
     *  passée en argument (cos, sin, atan...)
     * @param pas Correspond au pas souhaité pour le calcul des valeurs 
     * @param valMin Valeur Min de l'intervalle 
     * @param valMax Valeur Max de l'intervalle 
     * @param s nom de la fonction trigo dont on souhaite calculer l'écart 
     * @return
     */
    public double moyenneNbBitsEcarts(float pas, float valMin, float valMax, String s){
        EcartReel e= new EcartReel();
        MathD m = new MathD();
        long nbVal =0; 
        long somme=0;
        int biteEcart;
        for (float i=valMin; i<valMax; i+=pas){
            String hexResPerso="";
            String hexResMath="";
            int valIntA=0;
            int valIntB=0;
            switch (s){
                case "cos": 
                    valIntA=Float.floatToIntBits(m.cos(i));
                    valIntB= Float.floatToIntBits((float)Math.cos(i));
                    break; 
                case "sin":
                    valIntA=Float.floatToIntBits(m.sin(i));
                    valIntB= Float.floatToIntBits((float)Math.sin(i));
                    break; 
            }
            
            //Conversion vers un hexa
            hexResPerso= Integer.toHexString(valIntA);
            hexResMath= Integer.toHexString(valIntB);
            biteEcart= e.nbBitEcarts(hexResPerso, hexResMath);
            somme+= biteEcart;
            nbVal++;

            /*--------------Affichage--------------*/
            System.out.println("\nHexa Perso: acos("+i+")="+hexResPerso);
            System.out.println("Hexa Math : acos("+i+")="+hexResMath);

            System.out.println("Decimal Perso: acos("+i+")="+m.atan(i));
            System.out.println("Decimal Math : acos("+i+")="+(float)Math.atan(i));
            System.out.println("Bites d'écart : "+ biteEcart + "\n");
        }
        
        return (double)somme/(double)nbVal;
    }

    /**
     * Retourne le nombre de bits d'écart entre 
     * deux hexa passés sous forme de STRING en paramètre 
     * @param s1 : Premier hexa sous forme de String
     * @param s2 : Deuxième hexa sous forme de String
     * @return
     */
    public int nbBitEcarts(String s1, String s2){
        int i=0,k,j, nbChar,nbBitsEcarts ;
        while (i<s1.length() && s1.charAt(i) ==s2.charAt(i) ){
            i++;
        }
        if (i==s1.length()){
            return 0;
        }

        //Créer deux tableaux avec les caractères différents 
        char [] tab1= new char [16];
        char [] tab2= new char [16]; 
        for (k=0; k+i<s1.length(); k++){
            tab1[k]= s1.charAt(i+k);
            tab2[k]= s2.charAt(i+k);
        }
        nbChar =k;
        nbBitsEcarts=0;
        //En deduire le nombre de bit d'écart grâce à ce tableau 
        //Pour le premier caractère : Faire une difference bit à bit pour cela convertir en binaire
        String bites1 = convertCharToBinary(tab1[0]);
        String bites2 = convertCharToBinary(tab2[0]);
        char[] bitesChar1 = bites1.toCharArray();
        char[] bitesChar2 = bites2.toCharArray();
        j=0; 
        while (j<4 && bitesChar1[j]==bitesChar2[j]){
            j++;
        }
        nbBitsEcarts=4-j;
        
        //Pour les autres
        for (int d=1; d<nbChar ; d++){
            //4 est la taille en bit d'un caractère hexa
            nbBitsEcarts+=4;
        }

        return nbBitsEcarts;
        }

        /**
         * Convertit un Char qui appartient à l'intervalle 0...f en sa forme binaire
         * @param c
         * @return
         */
        public static String convertCharToBinary(char c) {
            switch (c){
                case '0': return "0000";
                case '1': return "0001";
                case '2': return "0010";
                case '3': return "0011";
                case '4': return "0100";
                case '5': return "0101";
                case '6': return "0110";
                case '7': return "0111";
                case '8': return "1000";
                case '9': return "1001";
                case 'a': return "1010";
                case 'b': return "1011";
                case 'c': return "1100";
                case 'd': return "1101";
                case 'e': return "1110";
                case 'f': return "1111";
                default: return "0";
            }
        }
    }

