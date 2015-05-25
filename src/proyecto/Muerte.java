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
public class Muerte extends Ficha{

    public void setAtaque() {
        ataque = 4;
    }

    public void setVida() {
        vida = 3;
    }

    public void setEscudo() {
        escudo = 1;
    }
    
    @Override
    public void mover() {
       
    }

    @Override
    public void ataqueEspecial() {
       
    }
    
}
