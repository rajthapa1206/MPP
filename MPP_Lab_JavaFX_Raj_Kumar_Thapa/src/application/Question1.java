package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Question1 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Address Form");
			GridPane grid = new GridPane();

			
			//components
			Label nameLabel = new Label("Name");
			Label streetLabel = new Label("Street");
			Label cityLabel = new Label("City");
			Label stateLabel = new Label("State");
			Label zipLabel = new Label("Zip");
			
			TextField nameTextField = new TextField();
			TextField streetTextField = new TextField();
			TextField cityTextField = new TextField();
			TextField stateTextField = new TextField();
			TextField zipTextField = new TextField();
			Button submitBtn = new Button("Submit");
			HBox hbBtn = new HBox(10); // in a single horizontal row.
			hbBtn.setAlignment(Pos.BOTTOM_CENTER); 
			hbBtn.getChildren().add(submitBtn);
			grid.add(hbBtn, 1, 4);
			 
			
			//adding to the grid
			grid.add(nameLabel, 1, 0);
			grid.add(streetLabel, 5, 0);
			grid.add(cityLabel, 9, 0);
			grid.add(nameTextField, 1, 1);
			grid.add(streetTextField, 5, 1);
			grid.add(cityTextField, 9, 1);
			grid.add(stateLabel, 1, 2);
			grid.add(zipLabel, 5, 2);
			grid.add(stateTextField, 1, 3);
			grid.add(zipTextField, 5, 3);
			grid.add(submitBtn, 1, 4);
			
			//setting position
			
			grid.setHgap(10);
			grid.setVgap(10);
			grid.setPadding(new Insets(25, 25, 25, 25));
			grid.setAlignment(Pos.CENTER);
			
			
			submitBtn.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent e) {
					System.out.println(nameTextField.getText());
					System.out.println(streetTextField.getText());
					System.out.println(cityTextField.getText() + ", " + 
					stateTextField.getText() + " " + zipTextField.getText());
				}
			});
			
			Scene scene = new Scene(grid,600,200);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
