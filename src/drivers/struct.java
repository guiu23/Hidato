/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drivers;

/**
 *
 * @author Jordi Guiu
 */
public class struct {
    public String pos; 
    public String nom;  
    public Integer punts;
    
    
    public String getPos() {
        return pos;
    }

    public void setPos(String num) {
        this.pos = num;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public Integer getPunts() {
        return punts;
    }

    public void setPunts(Integer pts) {
        this.punts = pts;
    }
}


