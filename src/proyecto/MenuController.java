/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import static javafx.application.Platform.exit;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class MenuController implements Initializable {

    /**
     * Initializes the controller class.
     */
    ArrayList<Player> players= new ArrayList<>();
    @FXML
    public Button login,ok,oklogin;
    public TextField name;
    public PasswordField pass;
    public Label warning;
    @FXML
    public void Crear(){
        QuitarTexto();
       AparecerTexto();
    }
    
    public void Login(){
        QuitarTexto();
       AparecerTextologin();
    }
    
    @FXML
    public void Salir(){
        exit();
    }
    
    @FXML
    public void CrearJugador(){
        
        if(name.getText()!=null&&pass.getText()!=null){
          players.add(new Player(name.getText(),pass.getText()));
          QuitarTexto();  
        }else{
            warning.setVisible(true);
        }
        
        
    }
    
    @FXML
    public void Imprimir(){
        for(Player p: players){
            System.out.println(p.getUsername());
        }
    }
    public void AparecerTexto(){
        name.setVisible(true);
        pass.setVisible(true);
        ok.setVisible(true);
    }
     public void AparecerTextologin(){
        name.setVisible(true);
        pass.setVisible(true);
        oklogin.setVisible(true);
    }
    public void QuitarTexto(){
        name.setVisible(false);
        name.setText(null);
        pass.setVisible(false);
        pass.setText(null);
        ok.setVisible(false);
        oklogin.setVisible(false);
        warning.setVisible(false);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         QuitarTexto();
         warning.setVisible(false);
      Image img = new Image("http://mikecann.co.uk/wp-content/uploads/2009/12/javafx_logo_color_1.jpg");
     
        
        
    }    
    
}
