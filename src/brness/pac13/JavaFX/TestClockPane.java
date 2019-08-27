package brness.pac13.JavaFX;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TestClockPane extends Application{
    @Override
    public void start(Stage primaryStage) {
        ClockPane clockPane=new ClockPane();
        String timeString=clockPane.getHour()+":"+clockPane.getMinute()+":"+clockPane.getSecond();
        Label label=new Label(timeString);

        BorderPane borderPane=new BorderPane();
        borderPane.setCenter(clockPane);
        borderPane.setBottom(label);
        borderPane.setAlignment(label, Pos.CENTER);

        Scene scene=new Scene(borderPane);
        primaryStage.setTitle("TimeClock");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
