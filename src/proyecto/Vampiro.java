/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Alejandro
 */
public class Vampiro extends Ficha{
    
    public void setAtaque() {
        ataque = 3;
    }

    public void setVida() {
        vida = 4;
    }

    public void setEscudo() {
        escudo = 5;
    }
    
    @Override
    public void mover() {
       
    }
    
}
