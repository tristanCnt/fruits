/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.paniertp2;

import java.util.ArrayList;

/**
 *
 * @author ae086881
 */
public class Macedoine {
    
    private ArrayList<Fruit> fruits;
    private boolean seedless;
    
    public Macedoine(Fruit f){
        
        this.seedless = true;
        
        this.fruits = new ArrayList<Fruit>();
        this.fruits.add(f);
        
        if(!f.isSeedless())
            this.seedless = false;
    }
    
    public void Ajoute(Fruit f){
        this.fruits.add(f);
        
        if(!f.isSeedless())
            this.seedless = false;
    }
    
    public double getPrix(){
        
        double prix =0;
        
        for(Fruit f : this.fruits){
            prix += f.getPrix();
        }
        
        return prix;
    }
    
    public String toString(){
        
        String res ="";
        
        for(Fruit f : this.fruits)
        {
            res+= f.toString();
        }
        
        return res;
    }
    
}
