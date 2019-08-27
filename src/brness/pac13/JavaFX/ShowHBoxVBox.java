package brness.pac13.JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ShowHBoxVBox extends Application {
    @Override
    public void start(Stage primaryStage) {
        BorderPane pane=new BorderPane();

        pane.setTop(getHBox());
        pane.setBottom(getVBox());

        Scene scene=new Scene(pane);
        primaryStage.setTitle("ShowVBoxHBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private HBox getHBox(){
        HBox hBox=new HBox(15);
        hBox.setPadding(new Insets(15,15,15,15));
        hBox.setStyle("-fx-border-color:gold");
        hBox.getChildren().add(new Button("Computer Science"));
        hBox.getChildren().add(new Button("Chemistry"));
        return hBox;
    }

    private VBox getVBox(){
        VBox vBox=new VBox(15);
        vBox.setPadding(new Insets(15,5,5,5));
        vBox.getChildren().add(new Label("Courses"));
        Label[] courses={new Label("CSCI 1301"),new Label("CSCI 1302"),
                new Label("CSCI 1303"),new Label("CSCI 1304")};
        for(Label course:courses){
            vBox.getChildren().add(course);
        }
        return vBox;
    }
}
