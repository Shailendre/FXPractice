import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shailendra.singh on 7/14/16.
 */
public class Alert {

    public void getAlertStage(String[] msgPrompt) throws Exception{

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxml/alert.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        //
        AlertController alertController = fxmlLoader.<AlertController>getController();
        alertController.setAlertMsg(msgPrompt);
        //
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Alert");
        stage.show();
    }

}
