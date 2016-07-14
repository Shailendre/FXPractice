
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by shailendra.singh on 7/12/16.
 */
public class LoginController implements Initializable {


    @FXML
    TextField unameTextField = new TextField();
    @FXML
    PasswordField passTextField = new PasswordField();
    @FXML
    Button loginBtn;

    private boolean loginGranted = false;

    public final static String ADMIN = "admin";


    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("in login controller: ");
    }

    // return msg accordingly if admin or not
    public String[] getAlertMsg(boolean access) {
        if (access)
            return new String[]{"Access granted", ""};
        else
            return new String[]{"Admin access required", "Wrong credentials!"};
    }


    @FXML
    public void onLoginClick(ActionEvent actionEvent) throws Exception {

        String uname = unameTextField.getText();
        String pword = passTextField.getText();

        Alert alert = new Alert();

        //test on admin login
        if (uname.equals(ADMIN) && pword.equals(ADMIN))
            alert.getAlertStage(getAlertMsg(true));

        else
            alert.getAlertStage(getAlertMsg(false));
    }
}
