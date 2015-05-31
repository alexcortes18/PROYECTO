/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYECTO;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

/**
 *
 * @author jose
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private GridPane tablero = new GridPane();
    private ImageView imageview;
    private Image img = new Image(getClass().getResourceAsStream("peon.png"));
    private Image img2 = new Image(getClass().getResourceAsStream("yes.png"));
    private ImageView peon = new ImageView(img);
    private ImageView blank = new ImageView(img2);
    private Button[][] botones = new Button[6][6];
    private Scanner leer = new Scanner(System.in);
    private String lol;
    private int doctor,who, batman,superman,posx,posy;
    private Button ult= new Button("",((Node)blank));
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        System.out.println("You clicked me!");  
    }
    
    public void check(int a,int b){
        if(botones[a][b].getGraphic()==null)
            System.out.println("3");
    }
    
    public int getX(Button b){
        for (int i = 0; i <botones.length; i++) {
                    for (int j = 0; j < botones[i].length; j++) {
                        if(botones[i][j]==b){
                            doctor=i;
                            who=j;
                        }
                    }
                }           
                return doctor;
    }
    public int getY(Button b){
        for (int i = 0; i <botones.length; i++) {
                    for (int j = 0; j < botones[i].length; j++) {
                        if(botones[i][j]==b){
                            doctor=i;
                            who=j;
                        }
                    }
                }
                if(b instanceof Button)
                    System.out.println("posicion: "+ doctor+" "+who);
                
                return who;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    

        tablero.getColumnConstraints().add(new ColumnConstraints(20)); // column 0 is 100 wide
        tablero.getRowConstraints().add(new RowConstraints(-60));
     
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                
                botones[i][j] = new Button("", blank);
                
                tablero.add(botones[i][j], i, j);
                botones[i][j].setOnAction(mover);
            }
        }              
        
        for (int i = 0; i < 6; i++) {
           
                botones[i][0].setGraphic(new ImageView(img));
                botones[i][0].setId("Peon:"+i);
                botones[i][5].setGraphic(new ImageView(img));
                botones[i][5].setId("Peon2:"+i);       
        }       
        botones[0][5].setGraphic(peon);
    }      
        EventHandler mover= new EventHandler()  {

            @Override
            public void handle(Event event) {
         
                Object source = event.getTarget();
                Button tardis=(Button)source;
                
                doctor=getX(tardis);
                who=getY(tardis);

                if(ult.getGraphic()!=((Node)blank)){
                    posx=batman- doctor;
                    posy= superman-who;
                    if(posx<0)
                        posx=posx *(-1);
                    if(posy<0)
                        posy= posy*(-1);
                    
                    if((posx <=1)&& (posy <=1)){
                        System.out.println("si");
                
                        if(botones[doctor][who].getGraphic()==((Node)blank)){
                            botones[doctor][who].setGraphic(ult.getGraphic());
                            ult.setGraphic(((Node)blank));
                            return;
                        }
                    }      
                }           
                ult=tardis;    
                batman= doctor;
                superman= who;
            }              
        };   
}