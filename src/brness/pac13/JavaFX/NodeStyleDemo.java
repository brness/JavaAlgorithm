package brness.pac13.JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Stack;

public class NodeStyleDemo extends Application{
    @Override
    public void start(Stage primaryStage) {
        StackPane pane=new StackPane();
        Button bt=new Button("OK");
        bt.setStyle("-fx-border-color:blue;");
        pane.getChildren().add(bt);
        pane.setRotate(45);
        pane.setStyle("-fx-border-color:red;-fx-background-color:lightgray;");
        Scene scene=new Scene(pane,200,250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Node");
        primaryStage.show();
    }
}
