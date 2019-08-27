package brness.pac13.JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.LinkedList;

public class ShowLine extends Application{
    @Override
    public void start(Stage primaryStage) {
        Scene scene=new Scene(new LinePane());
        primaryStage.setTitle("ShowLine");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class LinePane extends Pane{
    public LinePane(){
        Line line=new Line(10,10,10,10);
        line.endXProperty().bind(widthProperty().subtract(10));
        line.endYProperty().bind(heightProperty());
        line.setStrokeWidth(5);
        line.setStroke(Color.GREEN);
        getChildren().add(line);

        Line line1=new Line(10,10,10,10);
        line1.startXProperty().bind(widthProperty().subtract(10));
        line1.endYProperty().bind(heightProperty().subtract(10));
        line1.setStrokeWidth(5);
        line1.setStroke(Color.GREEN);
        getChildren().add(line1);
    }

}
