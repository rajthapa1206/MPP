package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class Question3a extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Menu");

        MenuBar menuBar = new MenuBar();

        Menu menu = new Menu("Menu");

        MenuItem menuItem1 = new MenuItem("Item1");
        MenuItem menuItem2 = new MenuItem("Item2");
        MenuItem menuItem3 = new MenuItem("Item3");

        Label label = new Label("No menu item selected");
        label.setTextFill(Color.web("#ff1a1a"));
        label.setAlignment(Pos.CENTER);


        menuBar.getMenus().add(menu);
        menu.getItems().add(menuItem1);
        menu.getItems().add(menuItem2);
        menu.getItems().add(menuItem3);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(menuBar, label);
        primaryStage.setScene(new Scene(vBox, 600, 600));
        primaryStage.show();


        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                label.setText("\t\t\t\t" + ((MenuItem)actionEvent.getSource()).getText() +
                        " selected");
                label.setFont(Font.font("Verdana", FontPosture.ITALIC, 20));
                label.setTextFill(Color.web("#00cc44"));
            }
        };

        menuItem1.setOnAction(event);
        menuItem2.setOnAction(event);
        menuItem3.setOnAction(event);

    }

}
