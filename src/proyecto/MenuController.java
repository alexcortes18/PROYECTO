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
    public Button login,ok;
    public TextField name;
    public PasswordField pass;
    @FXML
    public void Crear(){
        name.setVisible(true);
        pass.setVisible(true);
        ok.setVisible(true);
    }
    
    @FXML
    public void Salir(){
        exit();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         name.setVisible(false);
         pass.setVisible(false);
         ok.setVisible(false);
      Image img = new Image("http://mikecann.co.uk/wp-content/uploads/2009/12/javafx_logo_color_1.jpg");
     
        
        
    }    
    
}
