package brness.pac13.JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TestTriangle extends Application{
    @Override
    public void start(Stage primaryStage) {
        Pane pa=new Pane();
        Rectangle re=new Rectangle(10,10,100,50);
        re.setFill(Color.RED);
        re.setStroke(Color.BLACK);
        pa.getChildren().add(re);

        Scene scene=new Scene(pa);
        primaryStage.setTitle("TestRectangle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
