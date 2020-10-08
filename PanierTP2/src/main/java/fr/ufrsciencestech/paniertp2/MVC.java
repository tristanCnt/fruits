/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.paniertp2;

import MVC.*;

//utilise pour springIoC :
import javax.swing.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author celine
 */
public class MVC {
    private VueG vueg;      //pour pouvoir changer de vue si on le souhaite
    private Controleur controleur;  //pour pouvoir changer de controleur si on le souhaite
    
    /**
     * @return the vueg
     */
    public VueG getVueg() {
        return vueg;
    }

    /**
     * @param vueg the vueg to set
     */
    public void setVueg(VueG vueg) {
        this.vueg = vueg;
    }

    /**
     * @return the controleur
     */
    public Controleur getControleur() {
        return controleur;
    }

    /**
     * @param controleur the controleur to set
     */
    public void setControleur(Controleur controleur) {
        this.controleur = controleur;
    }
    
    
    public MVC(Panier p){
        //sans utiliser SpringIoC :
        vueg = new VueGSwing();
        controleur = new Controleur();
        Modele modele = new Modele(p);
        VueConsole vuec = new VueConsole();

        controleur.setModele(modele);                 
        modele.addObserver(vueg);        
        modele.addObserver(vuec);         
        vueg.addControleur(controleur);
    }
    
}
