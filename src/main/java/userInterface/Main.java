package userInterface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{

        String[] initStrings = new String[81];

        for (int i = 0; i < 81; i++) {
            initStrings[i] = "";
        }

        /*initStrings[0] = "2";
        initStrings[49] = "5";*/

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/inputView.fxml"));
        Parent root = loader.load();

        stage.setTitle("Sudoku Solver by Daniel");

        Scene scene = new Scene(root);

        InputController controller = loader.getController();
        controller.initArray(initStrings);

        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
