package brness.pac13.JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class ShowEllipse extends Application{
    @Override
    public void start(Stage primaryStage) {
        Pane pane=new Pane();

        for(int i=0;i<16;i++){
            Ellipse e1=new Ellipse(150,100,100,50);
            e1.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
            e1.setFill(Color.WHITE);
            e1.setRotate(i*180/16);
            pane.getChildren().add(e1);
        }

        Scene scene=new Scene(pane);
        primaryStage.setTitle("ShowEllipse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
