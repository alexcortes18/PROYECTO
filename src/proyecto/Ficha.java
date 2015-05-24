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
public abstract class Ficha {
    protected int ataque, vida, escudo;
//------------------SETS Y GETS--------------------------
    public int getAtaque() {
        return ataque;
    }

    public int getVida() {
        return vida;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }
    
//--------------Funciones---------------------------------- 
    
    
    public abstract void mover();
    
}
