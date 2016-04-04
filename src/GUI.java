/**
 * Created by suddan on 2016-04-04.
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Stage mainstage = new Stage();
        Group root = new Group();
        mainstage.setTitle("Mazin java tjosan");
        HBox stuff = new HBox();
        Scene scene = new Scene(stuff, 500, 500);



        VBox vb1 = new VBox();
        Label label = new Label("LOL");
        vb1.getChildren().add(label);
        VBox vb2= new VBox();
        VBox vb3= new VBox();
        VBox vb4 = new VBox();

        stuff.getChildren().addAll(vb1,vb2,vb3,vb4);
        //stuff


        mainstage.setScene(scene);
        mainstage.show();

    }


}
