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
public class HombreLobo extends Ficha{

    @Override
    public void setAtaque() {
        ataque = 5;
    }

    @Override
    public void setVida() {
        vida = 5;
    }

    public void setEscudo() {
        escudo =2;
    }
    
    
    @Override
    public void mover() {
        
    }

    @Override
    public void ataqueEspecial() {
        
    }
    
}
