package brness.pac13.JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ShowArc extends Application{
    @Override
    public void start(Stage primaryStage) {
        Pane pa=new Pane();
        Arc arc=new Arc(150,100,80,80,30,35);
        arc.setFill(Color.RED);
        arc.setType(ArcType.ROUND);
        pa.getChildren().add(new Text(210,40,"arc:round"));
        pa.getChildren().add(arc);

        Arc arc1=new Arc(150,100,80,80,30+90,35);
        arc1.setFill(Color.WHITE);
        arc1.setType(ArcType.OPEN);
        arc1.setStroke(Color.BLACK);
        pa.getChildren().add(new Text(20,40,"arc1:open"));
        pa.getChildren().add(arc1);

        Scene scene=new Scene(pa);
        primaryStage.setTitle("ShowArc");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
