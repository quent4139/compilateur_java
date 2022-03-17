import java.lang.Math;
/**
 * <b>Rôle</b> 
 * Cette classe comprend la versions d'algorithmes permettant le calculs des 
 * differentes fonctions utiles au fonctionnement de math.decah
 * <br> <br> 
 * - Cosinus et sinus calculé à partir du développement de Taylor <br>
 * - Cosinus et sinus calculé avec la méthode Cordic <br>
 * - Atan déduis du developpement de Taylor <br>
 * - Plusieurs méthodes pour le calcul de l'ulp <br>
 */
public class MathP {
    public float pi= 3.141592600f;
    public float pi2= 5.358979e-9f;
    public float[] tab= {0.785398163f,0.099668652f,0.009999667f,0.001f,0.0001f, 1e-5f,1e-6f,1e-7f,1e-8f};//Pour la méthode CORDIC
    
    public MathP() {
    }

    /**
     * Retourne la valeur absolu d'un nombre
     * @param entry
     * @return
     */
    float _abs(float val){
        if (val < 0.0) {
            return(-1.0f * val);
        }
        return (val);
    }

    /**
     * Factoriel de f passé en paramètre
     * @param k
     * @return
     */
    int _factoriel(int val){
        if (val <= 0) {return 1;}
        return (_factoriel(val - 1) * val);
    }

    /**
     * Retourne la racine carrée de n passé en paramétre grâce à l'algo de heron 
     * @param n
     * @return
     */
    static float _sqrt(float x) {
        if (x<0){
            return Float.NaN;
        }
        float d = x;
        float t = 0;
        while (t != d) {
            t = d;
            d = (x / d + d) / 2;
        }
        return d;
    }


    float _cos(float f) {
        float decal, x=1, y=0, r=1, z, pow=1, s=1;
        int iDecal, i=0;
        if (f <0){
            f=-f;
        }
        if (f>pi){
            decal=f/(2*this.pi);
            iDecal = (int)(decal);
            f= f-(2*this.pi*iDecal + 2*this.pi2*iDecal);
        }
        while (i<8){
            while (f>=tab[i]){
                z=x-y/(pow);
                y=y+x/(pow);
                x=z;
                r*= _sqrt(1+s);
                f=f-tab[i];
            }
            i=i+1;
            pow=pow*10;
            s=s/100;
        }
        return x/r;
    }

    /**
     * Retourne la valeur du cosinus de l'angle passé en paramètre
     * Cosinus calculé grâce à la méthode Cordic modifié
     * <ul>
     * <li> Précision <2 bits si -pi<angle<pi
     * <li> Précision <5 bits si |angle|<100pi
     * </ul>
     * @param angle
     * @return
     */
    public float cos_cordic1(float angle){
        MathP m= new MathP();
        //Pour gérer les nombres négatifs
        if (angle <0){
            angle=-angle;
        }
        //Décalage de plusieurs pi pour limiter l'erreur mais une erreur survient à cause de l'arrondi du pi
        if (angle>m.pi){
            float nbPiDecalage=angle/(2*m.pi);
            int iNbPiDecalage = (int)nbPiDecalage;
        //     // int n = 100000000;
        // angle= angle-(float)(2*m.pi*iNbPiDecalage + 2*m.ptpi*iNbPiDecalage);
        //     for (int i= 0; i<iNbPiDecalage; i++){
        //         angle= angle -2*m.pi;
        //     }
        //     //Avec la classe math on obtient
        angle= angle -(float)(2*Math.PI*iNbPiDecalage);
        }
        
        float x = 1, y=0, r=1, z;    
        int i=0;
        float pow=1f, s=1f;//Pour éviter la redondance

        for (i=0; i<8; i++){
            while (angle>=tab[i]){
                z=x-y/(pow);
                y=y+x/(pow);
                x=z;
                r*= _sqrt(1+s);
                angle=angle-tab[i];
            }
            
            pow=pow*10;
            s=s/100;
    }
    return x/r;
    }

    /**
     * Retourne la valeur du sinus de l'angle passé en paramètre
     * Sinus calculé grâce à la méthode Cordic légérement modifié afin d'augmenter la précision
     * @param angle
     * @return
     */
    public float sin_cordic1(float angle){
        int signe =1;
        if (angle <0){
            angle=-angle;
            signe =-1;
        }
        float x = 1, y=0, r=1, z;    
        int i=0;
        float pow=1f, s=1f;//Pour éviter la redondance

        for (i=0; i<8; i++){
            while (angle>=tab[i]){
                z=x-y/(pow);
                y=y+x/(pow);
                x=z;
                r*= _sqrt(1+s);
                angle=angle-tab[i];
            }
            
            pow=pow*10;
            s=s/100;
    }
    if (signe<0){
        return -y/r;
    }
    else{
        return y/r;
    }
}

    /**
     * Retourne la valeur de la tangente de l'angle passé en paramètre
     * Sinus calculé grâce à la méthode Cordic légérement modifié afin d'augmenter la précision
     * @param f
     * @return
     */
    public float tan_cordic1(float f){
        return sin_cordic1(f)/cos_cordic1(f);
    }

    /**
     * Renvoie l'arctangente d'un float passé en paramètre 
     * Calcule avec une précision moyenne je pense
     * @param x
     * @return
     */
    public float _atan(float x){
        float atg, a, b;
        int n;
        a= 1/_sqrt(1+x*x); 
        b=1;
        for (n=1; n<=11; n++){
            a= (a+b)/2;
            b= _sqrt(a*b);
        }
        atg = x/(_sqrt(1+x*x)*a);
        return atg;
    }

    /**
     * Retourne l'arcos de x passé en paramètre
     * @param x
     * @return
     */
    public float _acos(float x){
        if (_abs(x)>1){
            return Float.NaN;
        }
        if (_abs(x)==1.0){
            return (1-x)*pi/2.0f;
        }
        return _atan(-x/_sqrt(1-x*x))+2*_atan(1);
    }
    
    /**
     * Retourne l'arcin de x passé en paramètre
     * @param x
     * @return
     */
    public float _asin(float x){
        return pi/2 - _acos(x);
    }

    /*-------------------Zone de test---------------------*/

    public static double i_pi (double n, double m) {
        double m_pi = 0;
        double pow = -1;
        for (int i = 1; i < n; i++) {
            pow*=-1;
            m_pi += m * pow / (2*i - 1);
        }
        return 4 * m_pi;
    }

    float ulp2(float f){
        float aproximation;
        int i=0;
        float a = 0.25f;  
        while (i<6){
            a = a*a;
            i++;
        }
        aproximation = f + a;
        while (aproximation == f){
            a = a * 2;
            aproximation = f + a;
        }
        return (a);
    }



    
    
    // /**
    //  * Tan trouvé à partir d'un algo de type CORDIC
    //  * @param val
    //  * @return
    //  */
    // public float _tan(float val){
    //     MathP m= new MathP();
    //     //Décalage de plusieurs pi si val négatif-> notre algo ne fonctionne pas avec les valeurs négatives
    //     if (val<0){
    //         float nbPiDecalage=-val/pi;
    //         int iNbPiDecalage = (int)nbPiDecalage+1;
    //         val= val+iNbPiDecalage*m.pi;
    //     }
    //     float newx, newy, puis=0.1f;
    //     float precision= 0.00000001f;
    //     float x=1, y=0; int i;
    //     float [] tab= monArctan();
    //     //Somme de plusieurs angles connus jusqu'à obtenir un angle assez proche de a
    //     i=0;
    //     //System.out.println("Precision: "+ Double.toHexString(precision)); //Debuggage
    //     //System.out.println("Dernière case: "+ Double.toHexString(angle[7]));

    //     while (val>precision){
    //         while (val<tab[i]){
    //             i++;
    //             puis=puis/10;
    //         }
    //         // if (i==7){
    //         //     System.out.println("val: "+ Double.toHexString(val)); //Afficher le nombre de boucle pour la précision max
    //         // }
    //         val=val-tab[i];
    //         newx=x-puis*y;
    //         newy=puis*x+y;
    //         x=newx;
    //         y=newy;
    //     }
    //     return y/x;
    // }

    // /**
    //  * Retourne le cosinus de val calculé à partir de sa valeur de tangente
    //  * @param val
    //  * @return
    //  */
    // public float _cos(float val){
    //     MathP m = new MathP();
    //     float t= m._tan(val/2);
    //     return (1-t*t)/(1+t*t);
    // }

    // /**
    //  * Retourne le sinus de val calculé à partir de la valeur de sa tangente
    //  * @param val
    //  * @return
    //  */
    // public float _sin(float val){
    //     MathP m = new MathP();
    //     float t= m._tan(val/2);
    //     return (2*t)/(1+t*t);
    // }

    //  /**
    //   * Renvoie un tableau avec les valeurs des tan(t) avec t=10^i et i= 0,...., n
    //   * @return
    //   */
    //  public float[] monArctan(){
    //     String s= "2"; 
    //     float [] tab= new float[8];
    //     int i;
        
    //     switch (s){
    //         case "1": 
    //             float x=0.1f;
    //             //On va remplir le tableau 
    //             for (i=0; i<8; i++){
    //                 //Développement limité + methode de hormer ->Précis 9 chiffres après la virgules
    //                 //Détail des calculs sur brouillon tu pourras me demander Germain 
    //                 tab[i]= (((((-1.f/7.f)*x*x +(1.f/5.f))*x*x -1.f/3.f)*x*x+1.f)*x);
    //                 //On affiche les différentes valeurs de artanTeta
    //                 x=x/10;
    //             }
    //             return tab;
    //         case "2": 
    //             // tab[0]= 0.785398f;
    //             tab[0]= 0.099668f;
    //             tab[1]= 0.009999667f;
    //             tab[2]= 0.001f;
    //             tab[3]= 0.0001f;
    //             tab[4]= 0.00001f;
    //             tab[5]= 0.000001f;
    //             tab[6]= 0.0000001f;
    //             tab[7]= 0.00000001f;
    //             return tab;
    //     }
    //     return tab;
    // }

    
}
