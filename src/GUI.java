/**
 * Created by suddan on 2016-04-04.
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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
        //miniraknare Miniraknare = new miniraknare();

        Stage mainstage = new Stage();
        Group root = new Group();
        mainstage.setTitle("Mazin java tjosan");
        HBox stuff = new HBox();
        Scene scene = new Scene(stuff, 400, 500);

        VBox verticalStack = new VBox(10);

        HBox top = new HBox(20);
        Label tal1 = new Label("Tal 1");
        tal1.setMinSize(40,20);
        Label tal2 = new Label("Tal 2");
        tal2.setMinSize(40,20);

        top.getChildren().addAll(tal1,tal2);
        verticalStack.getChildren().add(top);

        HBox topBox = new HBox(10);

        TextField x = new TextField();
        x.setPrefSize(40,20);
        TextField y = new TextField();
        y.setPrefSize(40,20);

        topBox.getChildren().addAll(x,y);
        verticalStack.getChildren().add(topBox);

   /*     HBox expectedBox = new HBox(5);
        Label expected = new Label("Expected");
        expected.setPrefSize(70,20);

        Label btn_expected = new Label("");
        //btn_expected.setPrefSize(100,20);
        expectedBox.getChildren().addAll(expected,btn_expected);
        verticalStack.getChildren().add(expectedBox);
*/
        HBox gotBox = new HBox(5);
        Label result = new Label("Got");
        result.setPrefSize(70,20);
        Label btn_got = new Label("");
        //btn_got.setMinSize(40,20);

        gotBox.getChildren().addAll(result,btn_got);
        verticalStack.getChildren().add(gotBox);

        HBox operators = new HBox(5);
        Button btnPlus = new Button("+");
        btnPlus.setPrefSize(40,40);

        btnPlus.setOnAction(e -> {
            try {

                btn_got.setText(Double.toString(miniraknare.addera(Double.parseDouble(x.getText()), Double.parseDouble(y.getText()))));
            }
            catch (NumberFormatException nfe) {
                btn_got.setText("Använd bara siffror noob");
            }
            });

        Button btnSub = new Button("-");
        btnSub.setPrefSize(40,40);
        btnSub.setOnAction(e -> {
            try {

                btn_got.setText(Double.toString(miniraknare.subera(Double.parseDouble(x.getText()), Double.parseDouble(y.getText()))));
            }
            catch (NumberFormatException nfe) {
                btn_got.setText("Använd bara siffror noob");
            }
        });
        Button btnMult = new Button("*");
        btnMult.setPrefSize(40,40);
        btnMult.setOnAction(e -> {
            try {

                btn_got.setText(Double.toString(miniraknare.mult(Double.parseDouble(x.getText()), Double.parseDouble(y.getText()))));
            }
            catch (NumberFormatException nfe) {
                btn_got.setText("Använd bara siffror noob");
            }
        });
        Button btnDiv = new Button("/");
        btnDiv.setPrefSize(40,40);
        btnDiv.setOnAction(e -> {
            try {

                btn_got.setText(Double.toString(miniraknare.divide(Double.parseDouble(x.getText()), Double.parseDouble(y.getText()))));
            }
            catch (NumberFormatException nfe) {
                btn_got.setText("Använd bara siffror noob");
            }
        });
        Button btnSqrt = new Button("^0,5");
        btnSqrt.setPrefSize(50,40);
        btnSqrt.setOnAction(e-> {
            try {

                btn_got.setText(Double.toString(miniraknare.sqrt(Double.parseDouble(x.getText()))));
            }
            catch (NumberFormatException nfe) {
                btn_got.setText("Använd bara siffror noob");
            }
        });

        Button btnPi = new Button("PI");
        btnPi.setPrefSize(40,40);
        btnPi.setOnAction(e -> {
            btn_got.setText(Double.toString(Math.PI));
        });
        operators.getChildren().addAll(btnPlus,btnSub,btnDiv,btnMult,btnSqrt,btnPi);
        verticalStack.getChildren().add(operators);




        HBox botButtons = new HBox(5);
        Button quit = new Button("Quit");
        quit.setOnAction(e -> System.exit(0));



        Button reset = new Button("Reset");
        reset.setOnAction(e -> {
            x.setText("");
            y.setText("");
            //btn_expected.setText("");
            btn_got.setText("");
        });
        botButtons.getChildren().addAll(quit,reset);
        verticalStack.getChildren().add(botButtons);


        stuff.getChildren().addAll(verticalStack);
        mainstage.setScene(scene);
        mainstage.show();

    }



}
