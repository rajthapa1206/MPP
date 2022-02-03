package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Question2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("String Utility");
        GridPane rootGrid = new GridPane();

        Button countLetterBtn = new Button("Count Letters");
        countLetterBtn.setMinWidth(150);
        Button reverseLettersBtn = new Button("Reverse Letters");
        reverseLettersBtn.setMinWidth(150);
        Button removeDupBtn = new Button("Remove Duplicates");
        removeDupBtn.setMinWidth(150);

        Label inputLabel = new Label("Input");
        TextField inputTextField = new TextField();
        Label outputLabel = new Label("Output");
        TextField outputTextField = new TextField();

        GridPane leftGrid = new GridPane();
        leftGrid.setAlignment(Pos.CENTER);
        leftGrid.setVgap(20);
        leftGrid.setPadding(new Insets(20, 20, 20, 20));
        leftGrid.add(countLetterBtn, 0, 0);
        leftGrid.add(reverseLettersBtn, 0, 1);
        leftGrid.add(removeDupBtn, 0, 2);

        GridPane rightGrid = new GridPane();
        rightGrid.add(inputLabel, 0, 0);
        rightGrid.add(inputTextField, 0, 1);
        rightGrid.add(outputLabel, 0, 2);
        rightGrid.add(outputTextField, 0, 3);
        rightGrid.setAlignment(Pos.CENTER);
        rightGrid.setVgap(5);

        rootGrid.add(leftGrid, 0, 0);
        rootGrid.add(rightGrid, 1, 0);
        rootGrid.setHgap(20);
        rootGrid.setAlignment(Pos.CENTER);

        Scene scene = new Scene(rootGrid, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

        //button action event
        countLetterBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                String inputString = inputTextField.getText();
                int size = inputString.length();
                outputTextField.setText(String.valueOf(size));
            }
        });
        reverseLettersBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                String inputString = inputTextField.getText();
                String reversedString = "";
                int len = inputString.length();
                for (int i = len - 1; i >= 0; i--) {
                    reversedString += inputString.charAt(i);
                }
                outputTextField.setText(reversedString);
            }
        });

        removeDupBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                String inputString = inputTextField.getText();
                StringBuffer sb = new StringBuffer();

                for (int i = 0; i < inputString.length(); i++) {
                    if (sb.toString().indexOf(inputString.charAt(i)) < 0)
                        sb.append(inputString.charAt(i));
                }
                outputTextField.setText(sb.toString());
            }
        });


    }
}