/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author usuario
 */
public class Player {
    protected String username,password;
    protected int puntos,partidas;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getPartidas() {
        return partidas;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setPartidas(int partidas) {
        this.partidas = partidas;
    }
    
    
}
