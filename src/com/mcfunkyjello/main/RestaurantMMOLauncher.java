package com.mcfunkyjello.main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

//FOR SWAPPING TO MAIN GAME JUST MAKE A NEW SCENE AND SWAP TO IT :D
//
//TODO:
//
//  I put off the settings menu because I wanted to start on the character customization screen functionality first, but
//  I've laid the initial groundwork for the Settings (Keybindings) menu. Prob gunna have it read from a file, idk yet.
//
// BTW MAKE SURE YOU PUT IN A BOOLEAN OR SOMETHING THATLL KEEP MULTIPLE MENUS FROM BEING OPEN (I.E. SETTINGS AND CHAR)

public class RestaurantMMOLauncher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Placeholder Title");
        //Setting up menu buttons.
        Button playButton = new Button();
        Button charButton = new Button();
        Button settingsButton = new Button();
        Button quitButton = new Button();
        playButton.setText("Play");
        charButton.setText("Character");
        settingsButton.setText("Settings");
        quitButton.setText("Quit");

        //Define static button interactions here (not reliant on game states).
        playButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("play button fired");
            }
        });
        charButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage charStage = new Stage();
                GridPane charPanel = new GridPane();
                charPanel.setAlignment(Pos.CENTER);
                //init panel components
                Button skinButtonLeft = new Button("<-");
                Button skinButtonRight = new Button("->");
                Button hairButtonLeft = new Button("<-");
                Button hairButtonRight = new Button("->");
                Button shirtButtonLeft = new Button("<-");
                Button shirtButtonRight = new Button("->");
                Button pantsButtonLeft = new Button("<-");
                Button pantsButtonRight = new Button("->");
                //add panel components
                charPanel.add(skinButtonLeft,1,0);
                charPanel.add(skinButtonRight,2,0);
                charPanel.add(hairButtonLeft,1,1);
                charPanel.add(hairButtonRight,2,1);
                charPanel.add(shirtButtonLeft,1,2);
                charPanel.add(shirtButtonRight,2,2);
                charPanel.add(pantsButtonLeft,1,3);
                charPanel.add(pantsButtonRight,2,3);

                Scene charScene = new Scene(charPanel);
                charStage.sizeToScene();
                charStage.setScene(charScene);
                charStage.show();
            }
        });
        settingsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //init components
                Stage settingsSt = new Stage();
                GridPane settingP = new GridPane();
                //set component layout
                settingP.setAlignment(Pos.CENTER);
                settingP.setVgap(10);
                TextArea txt = new TextArea("W");
                txt.setEditable(false);
                txt.setFont(new Font("Arial",20.0));
                Button bindButton1 = new Button("Click to change keybinding.");
                //add components
                settingP.add(txt,0,0);
                settingP.add(bindButton1,1,0);
                //display stage
                settingsSt.setScene(new Scene(settingP));
                settingsSt.sizeToScene();
                settingsSt.show();
            }
        });
        quitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.close();
            }
        });

        //Initialize window.
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(20);
        root.setVgap(20);
        root.setPadding(new Insets(25,25,25,25));
        //Add buttons to root (panel)
        root.add(playButton,0, 0);
        root.add(charButton, 0,1);
        root.add(settingsButton,0,2);
        root.add(quitButton,0,3);
        //Set button alignment
        GridPane.setHalignment(playButton,HPos.CENTER);
        GridPane.setHalignment(charButton,HPos.CENTER);
        GridPane.setHalignment(settingsButton,HPos.CENTER);
        GridPane.setHalignment(quitButton,HPos.CENTER);
        //Set up window background image
        BackgroundImage bgImage = new BackgroundImage(new Image("char_menu.png"),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        root.setBackground(new Background(bgImage));
        //Display initialized window
        primaryStage.setScene(new Scene(root));
        primaryStage.setMaximized(true);
        primaryStage.show();
    }
}
