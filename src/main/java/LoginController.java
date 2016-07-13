
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by shailendra.singh on 7/12/16.
 */
public class LoginController implements Initializable {


    @FXML
    TextField uname, password;
    @FXML
    Button loginBtn;



    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("init: ");
    }

    @FXML
    public void onLoginClick(ActionEvent actionEvent){

    }
}
