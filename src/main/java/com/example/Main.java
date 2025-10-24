package com.example;


import java.util.logging.Logger;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    VBox mainLayout = new VBox(20);

    mainLayout.setAlignment (Pos.CENTER);

    mainLayout.setPadding (

    new Insets(40));
    mainLayout.setStyle (
            
    "-fx-background: linear-gradient(to bottom, #e8f5e8, #f0f9f0);" // Light green gradient background
        );
        
        // Create header section
        VBox headerSection = createHeaderSection();

    // Create button container with modern card styling
    VBox buttonContainer = new VBox(15);

    buttonContainer.setAlignment (Pos.CENTER);

    buttonContainer.setPadding (

    new Insets(30));
    buttonContainer.setStyle (
            

"-fx-background-color: white;" +
            "-fx-background-radius: 15;" +
            "-fx-border-radius: 15;" +
            "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.15), 20, 0, 0, 5);" +
            "-fx-border-color: #d4edda;" +
            "-fx-border-width: 1;"
        );

}