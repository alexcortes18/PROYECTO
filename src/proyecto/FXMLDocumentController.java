/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYECTO;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;

/**
 *
 * @author jose
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label2;
    private ImageView imageview;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        System.out.println("You clicked me!");
        label2.setText("Hello World!");
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
      Image img = new Image("http://mikecann.co.uk/wp-content/uploads/2009/12/javafx_logo_color_1.jpg");
      label2.setGraphic(new ImageView(img));
        
        
        
    }    
    
}
