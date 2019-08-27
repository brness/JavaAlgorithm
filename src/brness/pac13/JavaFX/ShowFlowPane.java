package brness.pac13.JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application{
    @Override
    public void start(Stage primaryStage) {
        FlowPane pane=new FlowPane();
        pane.setPadding(new Insets(11,12,13,15));
        pane.setHgap(10);
        pane.setVgap(5);

        pane.getChildren().addAll(new Label("First Name:"),new TextField(),new Label("Mi:"));
        TextField tfMi=new TextField();
        tfMi.setPrefColumnCount(1);
        pane.getChildren().addAll(tfMi,new Label("Last Name:"),new TextField());

        Scene scene=new Scene(pane,1000,200);
        primaryStage.setTitle("ShowFlowPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
