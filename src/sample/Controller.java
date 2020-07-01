package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Controller {
    @FXML
    Button btn1;
    @FXML
    Button btn2;
    @FXML
    TextArea textArea;
    @FXML
    TextField textField;

    public void btn2Click(ActionEvent actionEvent){
     System.out.println("Smiles will appear here later" + "/n");
      Text text = new Text();
      text.setText("SMILES WILL APPEAR HERE LATER");
      textArea.appendText(String.valueOf(text));
    }

    public void sendMsg() {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();

        btn1.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                new Timeline(
                        new KeyFrame(Duration.seconds(0), new KeyValue(btn1.opacityProperty(), 1)),
                        new KeyFrame(Duration.seconds(0.5), new KeyValue(btn1.opacityProperty(), 0))
                ).play();
            }
        });
        btn2.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                new Timeline(
                        new KeyFrame(Duration.seconds(0), new KeyValue(btn2.opacityProperty(), 1)),
                        new KeyFrame(Duration.seconds(0.5), new KeyValue(btn2.opacityProperty(), 0))
                ).play();
            }
        });

        btn1.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                new Timeline(
                        new KeyFrame(Duration.seconds(0), new KeyValue(btn1.opacityProperty(), 0)),
                        new KeyFrame(Duration.seconds(0.5), new KeyValue(btn1.opacityProperty(), 1))
                ).play();
            }
        });
        btn2.setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                new Timeline(
                        new KeyFrame(Duration.seconds(0), new KeyValue(btn2.opacityProperty(), 0)),
                        new KeyFrame(Duration.seconds(0.5), new KeyValue(btn2   .opacityProperty(), 1))
                ).play();
            }
        });
    }
}
