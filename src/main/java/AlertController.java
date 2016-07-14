import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by shailendra.singh on 7/14/16.
 */
public class AlertController implements Initializable {

    @FXML
    private Button okButton;

    @FXML
    private Label messageLabel ;

    @FXML
    private Label detailsLabel ;

    @FXML
    public void onOkBtnClick(ActionEvent actionEvent){
        //close the alert window on ok btn click
        Stage stage = (Stage) okButton.getScene().getWindow();
        stage.close();
    }

    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("in alert controller: ");
    }

    public void setAlertMsg(String[] msgPrompt) {
        messageLabel.setText(msgPrompt[0]);
        detailsLabel.setText(msgPrompt[1]);
    }
}
