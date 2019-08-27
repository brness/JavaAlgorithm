package brness.pac13.JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.awt.*;

public class MyJavaFX extends Application{
    @Override
    public void start(Stage primaryStage) {
        Button bt=new Button("ok");
        Scene scene=new Scene(bt,200,250);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
