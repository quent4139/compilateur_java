/**
 * <b>Rôle</b>
 * Cette classe contient les algorithmes retenus pour réaliser la classe math.decah
 * <br><br>
 * Elle contient entre autre:<br>
 * - Cosinus et sinus calculé avec la méthode Cordic <br>
 * - Atan déduis du developpement de Taylor <br>
 * - Une méthode sur R pour calculer l'ULP <br>
 */
public class MathD {
    float _pi= 3.1415926005f;
    float _pi2= 3.58979e-10f;

    /**
     * Retourne la valeur absolue d'une valeur {@code int}.
     * Si l'argument n'est pas négatif, l'argument est retourné.
     * Si l'argument est négatif, la négation de l'argument est retournée.
     * @param val
     * @return
     */
    float _abs(float val){
        if (val < 0.0) {
            return(-1.0f * val);
        }
        return (val);
    }

    /**
     * Retourne le factoriel d'une valeur {@code int}
     * Attention: Utiliser cette méthode avec parsimonie 
     * @param val
     * @return
     */
    int _factoriel(int val){
        if (val <= 0) {
            return 1;
        }
        return (_factoriel(val-1) * val);
    }

    /**
     *  Renvoie la racine carrée positive correctement arrondie d'une valeur
     * {@code float} valeur.
     * Cas spéciaux
     * <li>Si l'argument est une infinité positive, alors le résultat est positif.
     * infini positif.
     *<li>ISi l'argument est un zéro positif ou un zéro négatif, alors le
     * résultat est le même que l'argument.
     * Sinon, le résultat est la valeur {@code float} la plus proche de .
     *la véritable racine carrée mathématique de la valeur de l'argument.
     * @param x
     * @return
     */
    static float _sqrt(float x) {
        // assert(x>0);
        float d = x;
        float t = 0;
        while (t != d) {
            t = d;
            d = (x / d + d) / 2;
        }
        return d;
    }

    /**
     *  Renvoie le sinus trigonométrique d'un angle( Methode Cordic ameliore + decalage n*_pi).  
     * Cas spéciaux : 
     *<li>Si l'argument est zéro, alors le résultat est un zéro avec le
     *même signe que l'argument.</ul>
     *<p>Le résultat calculé doit être à moins de quelques ulp du résultat exact.
     * @param f
     * @return
     */
    float sin(float f) {
        float decal, x=1, y=0, r=1, z, pow=1, s=1;
        int iDecal, i=0;
        if (f <0){
            f=-f;
        }
        if (f>_pi){
            decal=f/(2*this._pi);
            iDecal = (int)(decal);
            f= f-(2*this._pi*iDecal + 2*this._pi2*iDecal);
        }
        while (i<8){
            while (f>=_tab(i)){
                z=x-y/(pow);
                y=y+x/(pow);
                x=z;
                r*= _sqrt(1+s);
                f=f-_tab(i);
            }
            i=i+1;
            pow=pow*10;
            s=s/100;
        }
        return y/r;
    }

    /**
     *  Renvoie le cosinus trigonométrique d'un angle( Methode Cordic ameliore + decalage n*_pi).  
     * Cas spéciaux: 
     * <p>Le résultat calculé doit être à moins de quelques ulp du résultat exact.
     * Les résultats doivent être semi-monotones .
     * @param f
     * @return
     */
    float cos(float f) {
        float decal, x=1, y=0, r=1, z, pow=1, s=1;
        int iDecal, i=0;
        if (f <0){
            f=-f;
        }
        if (f>_pi){
            decal=f/(2*this._pi);
            iDecal = (int)(decal);
            f= f-(2*this._pi*iDecal + 2*this._pi2*iDecal);
        }
        while (i<8){
            while (f>=_tab(i)){
                z=x-y/(pow);
                y=y+x/(pow);
                x=z;
                r*= _sqrt(1+s);
                f=f-_tab(i);
            }
            i=i+1;
            pow=pow*10;
            s=s/100;
        }
        return x/r;
    }


    /**
     *  Renvoie l'acos trigonométrique d'un angle( développement de Taylor).  
     * Cas spéciaux:
     *<p>Le résultat calculé doit être à moins de quelques ulp du résultat exact.
     * Les résultats doivent être semi-monotones .
     * @param f
     * @return
     */
    float acos(float f){
        assert (f<1 && f >-1);
        if (_abs(f)==1.0){
            return (1-f)*_pi/2.0f;
        }
        return atan(-f/_sqrt(1-f*f))+2*atan(1);
    }
    
    /**
     * Renvoie l'atan trigonométrique d'un angle( Application de la moyenne arithmétique-géométrique).  
     * <p>Le résultat calculé doit être à moins de quelques ulp du résultat exact.
     * Les résultats doivent être semi-monotones .
     * @param f
     * @return
     */
    float atan(float f){
        float atg, a, b;
        int n;
        a= 1/_sqrt(1+f*f); 
        b=1;
        for (n=1; n<=11; n++){
            a= (a+b)/2;
            b= _sqrt(a*b);
        }
        atg = f/(_sqrt(1+f*f)*a);
        return atg;
    }

    /**
     * Retourne l'arcin de x passé en paramètre (calculé à partir de l'atan)
     * @param x
     * @return
     */
    public float asin(float x){
        return this._pi/2 - acos(x);
    }


    /**
     * Renvoie la valeur du premier argument élevé à la puissance de
     * deuxième argument. 
     * <p>Le résultat calculé doit être à quelques ulp du résultat exact.
     * @param a
     * @param b
     * @return
     */
    float puiss(int a, int b){
        float pow=1;
        int maxPow=(int)_abs(b);
        for (int i=0;i<maxPow; i++){
            pow=a*pow;
        }
        if (b<0){
            return 1/pow;
        }
        return pow;   
    }
    /**
     * Retourne la puissance de 2 la plus proche
     * @param f
     * @return
     */
    int plusProchePuiss(float f){
        float abs= _abs(f);
        int pow;
        if (abs<puiss(2,-126)){ return -126;}
        else if (abs>puiss(2,127)){return 127;}
        else{
            int gauche=-126;
            int droite=127;
            int mid=1;
            while (droite-gauche>1){
                mid=(droite+gauche)/2;
                float puissMid= puiss(2,mid);
                if (abs>puissMid){
                    gauche=mid;
                }
                else if (abs<puissMid){
                    droite=mid;
                }
                else{
                    return mid;
                }
            }
            pow=gauche;
        }
        return pow;
    }

    /**
     *Renvoie la taille d'un ulp de l'argument. 
     * ULP: L’unité de précision élémentaire sur les nombres flottants est l’intervalle entre deux flottants
     *représentables (« Unit in the last place »)
     * @param f
     * @return
     */
    float ulp(float f){
        if (f==0){
            return 1.4e-45f;
        }
        return puiss(2, plusProchePuiss(f)-23);
    }


    //Substituer le tableau qui n'est pas implémenté en DECA
    float _tab(int i){
        if (i==0){
            return 0.785398163f;
        }
        if (i==1){
            return 0.099668652f;
        }
        if (i==2){
            return 0.009999667f;
        }
        if (i==3){
            return 0.001f;
        }
        if (i==4){
            return 0.0001f;
        }
        if (i==5){
            return 1e-5f;
        }
        if (i==6){
            return 1e-6f;
        }
        if (i==7){
            return 1e-7f;
        }
        if (i==8){
            return 1e-8f;
        }
        return 0.f;
    }

}

