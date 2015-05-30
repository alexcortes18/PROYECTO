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
import javafx.scene.control.Button;
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
    private Button button01;
    private Image img = new Image(getClass().getResourceAsStream("peon.png"));
    private Image img2 = new Image(getClass().getResourceAsStream("peon.png"));
    private Label label3 ;
    private Label test;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        System.out.println("You clicked me!");
        
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      ImageView img3 = new ImageView(img);
      label2.setGraphic(img3);
    
        
    }    
    
}
