package com.mcfunkyjello.main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;

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
