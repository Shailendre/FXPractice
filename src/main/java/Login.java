import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by shailendra.singh on 7/12/16.
 */
public class Login extends Application {


    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //set the parent root --> load the corresponding fxml class;
        Parent root = FXMLLoader.load(getClass().getResource("fxml/login.fxml"));
        //set the title
        primaryStage.setTitle("Login Page");
        /*
         * set the scene on the stage
         * @param: the scene object intialized with root(the resources file)
         */
        primaryStage.setScene(new Scene(root));
        primaryStage.sizeToScene();
        //show the stage
        primaryStage.show();
    }
}
