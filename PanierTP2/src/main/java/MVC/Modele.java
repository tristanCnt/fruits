/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.util.Observable;
import fr.ufrsciencestech.paniertp2.*;

/**
 *
 * @author celine
 */
public class Modele extends Observable{
    private int compteur;   //compteur toujours positif
    
    
     public Modele(Panier p){
        int nbOranges = 0;
        Orange o = new Orange();
        
        for(int i =0;i<p.getTaillePanier();i++)
        {
        if(p.getFruit(i).getClass()== o.getClass())
        {
            nbOranges+=1;
        }
        }
        compteur = nbOranges;
    }
     
    public Modele(){
        int nbOranges = 0;
        Orange o = new Orange();
        Fruit f = new Orange(5,"aa");
        if(f.getClass()== o.getClass())
        {
            nbOranges+=1;
        }
        
        compteur = nbOranges;
    }
    public void update(int incr) {
        compteur += incr;
        if(compteur < 0)
            compteur = 0;
        
        setChanged();                //marks this Observable object as having been changed; the hasChanged method will now return true
        notifyObservers(getCompteur());   //if this object has changed, as indicated by the hasChanged method, then notify all of its observers and then call the clearChanged method to indicate that this object has no longer changed
    }

    /**
     * @return the compteur
     */
    public int getCompteur() {
        return compteur;
    }

    /**
     * @param compteur the compteur to set
     */
    public void setCompteur(int compteur) {
        this.compteur = compteur;
        if(this.compteur < 0)
            this.compteur = 0;
        
        setChanged();                //marks this Observable object as having been changed; the hasChanged method will now return true
        notifyObservers(getCompteur());   //if this object has changed, as indicated by the hasChanged method, then notify all of its observers and then call the clearChanged method to indicate that this object has no longer changed
    }
    
}
