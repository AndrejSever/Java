package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Controller {

    @FXML
    TextArea textArea;

    @FXML
    TextField textField;
    @FXML
    TextField textField2;
    @FXML
    Button ok;

int a = 0;
String b = "";
    public void sendMsg() {

        if (textField.getText() == "") {
            ErrorWindow.newWindow("Нельзя отправлять пустые сообщения");
            textArea.appendText("Нельзя отправлять пустые сообщения" + "\n");
        } else if (a == 1) {
            ErrorWindow.newWindow("Нельзя отправлять повторяющиеся сообщения");
            textArea.appendText("Нельзя отправлять повторяющиеся сообщения" + "\n");
            a = 0;

        } else if (textField.getText().equals(b)) {
                textArea.appendText(textField.getText() + "\n" );
                textField.clear();
                textField.requestFocus();
                a += 1;

        } else {
            b = textField.getText();
            textArea.appendText(textField.getText() + "\n");
            textField.clear();
            textField.requestFocus();
            a = 0;
        }

    }


}
