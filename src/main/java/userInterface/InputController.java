package userInterface;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class InputController {


    @FXML
    private ChoiceBox cell00, cell01, cell02, cell03, cell04, cell05, cell06, cell07, cell08, cell09, cell10, cell11, cell12, cell13, cell14, cell15, cell16, cell17, cell18, cell19, cell20, cell21, cell22, cell23, cell24, cell25, cell26, cell27, cell28, cell29, cell30, cell31, cell32, cell33, cell34, cell35, cell36, cell37, cell38, cell39, cell40, cell41, cell42, cell43, cell44, cell45, cell46, cell47, cell48, cell49, cell50, cell51, cell52, cell53, cell54, cell55, cell56, cell57, cell58, cell59, cell60, cell61, cell62, cell63, cell64, cell65, cell66, cell67, cell68, cell69, cell70, cell71, cell72, cell73, cell74, cell75, cell76, cell77, cell78, cell79, cell80;

    private ChoiceBox[] arrayOfCells;

    private ObservableList<String> numbers = FXCollections.observableList(new ArrayList<String>(Arrays.asList("", "1", "2", "3", "4", "5", "6", "7", "8", "9")));

    @FXML
    private TextArea textAreaInputView;

    @FXML
    private Button solveButtonInputView, clearButtonInputView, returnButtonInputView;

    private String[] initStrings = new String[81];



    public void initialize() {

        returnButtonInputView.setDisable(true);

        textAreaInputView.setText("Input the given numbers in the grid, and then click the button 'Solve the Sudoku'.");

        solveButtonInputView.disableProperty().bind(cell00.valueProperty().isEqualTo("").and(cell01.valueProperty().isEqualTo("").and(cell02.valueProperty().isEqualTo("").and(cell03.valueProperty().isEqualTo("").and(cell04.valueProperty().isEqualTo("").and(cell05.valueProperty().isEqualTo("").and(cell06.valueProperty().isEqualTo("").and(cell07.valueProperty().isEqualTo("").and(cell08.valueProperty().isEqualTo("").and(cell09.valueProperty().isEqualTo("").and(cell10.valueProperty().isEqualTo("").and(cell11.valueProperty().isEqualTo("").and(cell12.valueProperty().isEqualTo("").and(cell13.valueProperty().isEqualTo("").and(cell14.valueProperty().isEqualTo("").and(cell15.valueProperty().isEqualTo("").and(cell16.valueProperty().isEqualTo("").and(cell17.valueProperty().isEqualTo("").and(cell18.valueProperty().isEqualTo("").and(cell19.valueProperty().isEqualTo("").and(cell20.valueProperty().isEqualTo("").and(cell21.valueProperty().isEqualTo("").and(cell22.valueProperty().isEqualTo("").and(cell23.valueProperty().isEqualTo("").and(cell24.valueProperty().isEqualTo("").and(cell25.valueProperty().isEqualTo("").and(cell26.valueProperty().isEqualTo("").and(cell27.valueProperty().isEqualTo("").and(cell28.valueProperty().isEqualTo("").and(cell29.valueProperty().isEqualTo("").and(cell30.valueProperty().isEqualTo("").and(cell31.valueProperty().isEqualTo("").and(cell32.valueProperty().isEqualTo("").and(cell33.valueProperty().isEqualTo("").and(cell34.valueProperty().isEqualTo("").and(cell35.valueProperty().isEqualTo("").and(cell36.valueProperty().isEqualTo("").and(cell37.valueProperty().isEqualTo("").and(cell38.valueProperty().isEqualTo("").and(cell39.valueProperty().isEqualTo("").and(cell40.valueProperty().isEqualTo("").and(cell41.valueProperty().isEqualTo("").and(cell42.valueProperty().isEqualTo("").and(cell43.valueProperty().isEqualTo("").and(cell44.valueProperty().isEqualTo("").and(cell45.valueProperty().isEqualTo("").and(cell46.valueProperty().isEqualTo("").and(cell47.valueProperty().isEqualTo("").and(cell48.valueProperty().isEqualTo("").and(cell49.valueProperty().isEqualTo("").and(cell50.valueProperty().isEqualTo("").and(cell51.valueProperty().isEqualTo("").and(cell52.valueProperty().isEqualTo("").and(cell53.valueProperty().isEqualTo("").and(cell54.valueProperty().isEqualTo("").and(cell55.valueProperty().isEqualTo("").and(cell56.valueProperty().isEqualTo("").and(cell57.valueProperty().isEqualTo("").and(cell58.valueProperty().isEqualTo("").and(cell59.valueProperty().isEqualTo("").and(cell60.valueProperty().isEqualTo("").and(cell61.valueProperty().isEqualTo("").and(cell62.valueProperty().isEqualTo("").and(cell63.valueProperty().isEqualTo("").and(cell64.valueProperty().isEqualTo("").and(cell65.valueProperty().isEqualTo("").and(cell66.valueProperty().isEqualTo("").and(cell67.valueProperty().isEqualTo("").and(cell68.valueProperty().isEqualTo("").and(cell69.valueProperty().isEqualTo("").and(cell70.valueProperty().isEqualTo("").and(cell71.valueProperty().isEqualTo("").and(cell72.valueProperty().isEqualTo("").and(cell73.valueProperty().isEqualTo("").and(cell74.valueProperty().isEqualTo("").and(cell75.valueProperty().isEqualTo("").and(cell76.valueProperty().isEqualTo("").and(cell77.valueProperty().isEqualTo("").and(cell78.valueProperty().isEqualTo("").and(cell79.valueProperty().isEqualTo("").and(cell80.valueProperty().isEqualTo(""))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))));

        clearButtonInputView.disableProperty().bind(cell00.valueProperty().isEqualTo("").and(cell01.valueProperty().isEqualTo("").and(cell02.valueProperty().isEqualTo("").and(cell03.valueProperty().isEqualTo("").and(cell04.valueProperty().isEqualTo("").and(cell05.valueProperty().isEqualTo("").and(cell06.valueProperty().isEqualTo("").and(cell07.valueProperty().isEqualTo("").and(cell08.valueProperty().isEqualTo("").and(cell09.valueProperty().isEqualTo("").and(cell10.valueProperty().isEqualTo("").and(cell11.valueProperty().isEqualTo("").and(cell12.valueProperty().isEqualTo("").and(cell13.valueProperty().isEqualTo("").and(cell14.valueProperty().isEqualTo("").and(cell15.valueProperty().isEqualTo("").and(cell16.valueProperty().isEqualTo("").and(cell17.valueProperty().isEqualTo("").and(cell18.valueProperty().isEqualTo("").and(cell19.valueProperty().isEqualTo("").and(cell20.valueProperty().isEqualTo("").and(cell21.valueProperty().isEqualTo("").and(cell22.valueProperty().isEqualTo("").and(cell23.valueProperty().isEqualTo("").and(cell24.valueProperty().isEqualTo("").and(cell25.valueProperty().isEqualTo("").and(cell26.valueProperty().isEqualTo("").and(cell27.valueProperty().isEqualTo("").and(cell28.valueProperty().isEqualTo("").and(cell29.valueProperty().isEqualTo("").and(cell30.valueProperty().isEqualTo("").and(cell31.valueProperty().isEqualTo("").and(cell32.valueProperty().isEqualTo("").and(cell33.valueProperty().isEqualTo("").and(cell34.valueProperty().isEqualTo("").and(cell35.valueProperty().isEqualTo("").and(cell36.valueProperty().isEqualTo("").and(cell37.valueProperty().isEqualTo("").and(cell38.valueProperty().isEqualTo("").and(cell39.valueProperty().isEqualTo("").and(cell40.valueProperty().isEqualTo("").and(cell41.valueProperty().isEqualTo("").and(cell42.valueProperty().isEqualTo("").and(cell43.valueProperty().isEqualTo("").and(cell44.valueProperty().isEqualTo("").and(cell45.valueProperty().isEqualTo("").and(cell46.valueProperty().isEqualTo("").and(cell47.valueProperty().isEqualTo("").and(cell48.valueProperty().isEqualTo("").and(cell49.valueProperty().isEqualTo("").and(cell50.valueProperty().isEqualTo("").and(cell51.valueProperty().isEqualTo("").and(cell52.valueProperty().isEqualTo("").and(cell53.valueProperty().isEqualTo("").and(cell54.valueProperty().isEqualTo("").and(cell55.valueProperty().isEqualTo("").and(cell56.valueProperty().isEqualTo("").and(cell57.valueProperty().isEqualTo("").and(cell58.valueProperty().isEqualTo("").and(cell59.valueProperty().isEqualTo("").and(cell60.valueProperty().isEqualTo("").and(cell61.valueProperty().isEqualTo("").and(cell62.valueProperty().isEqualTo("").and(cell63.valueProperty().isEqualTo("").and(cell64.valueProperty().isEqualTo("").and(cell65.valueProperty().isEqualTo("").and(cell66.valueProperty().isEqualTo("").and(cell67.valueProperty().isEqualTo("").and(cell68.valueProperty().isEqualTo("").and(cell69.valueProperty().isEqualTo("").and(cell70.valueProperty().isEqualTo("").and(cell71.valueProperty().isEqualTo("").and(cell72.valueProperty().isEqualTo("").and(cell73.valueProperty().isEqualTo("").and(cell74.valueProperty().isEqualTo("").and(cell75.valueProperty().isEqualTo("").and(cell76.valueProperty().isEqualTo("").and(cell77.valueProperty().isEqualTo("").and(cell78.valueProperty().isEqualTo("").and(cell79.valueProperty().isEqualTo("").and(cell80.valueProperty().isEqualTo(""))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))));


    }



    void initArray(String[] initStrings) {

        System.arraycopy(initStrings, 0, this.initStrings, 0, 81);

        initCells();
    }




    private void initCells() {

        arrayOfCells = new ChoiceBox[]{cell00, cell01, cell02, cell03, cell04, cell05, cell06, cell07, cell08, cell09, cell10, cell11, cell12, cell13, cell14, cell15, cell16, cell17, cell18, cell19, cell20, cell21, cell22, cell23, cell24, cell25, cell26, cell27, cell28, cell29, cell30, cell31, cell32, cell33, cell34, cell35, cell36, cell37, cell38, cell39, cell40, cell41, cell42, cell43, cell44, cell45, cell46, cell47, cell48, cell49, cell50, cell51, cell52, cell53, cell54, cell55, cell56, cell57, cell58, cell59, cell60, cell61, cell62, cell63, cell64, cell65, cell66, cell67, cell68, cell69, cell70, cell71, cell72, cell73, cell74, cell75, cell76, cell77, cell78, cell79, cell80};

        for (int i = 0; i < arrayOfCells.length; i++) {

            arrayOfCells[i].setItems(numbers);
            arrayOfCells[i].setValue(initStrings[i]);

        }

    }



    public void actionSolve(ActionEvent event) throws IOException {

        for (int i = 0; i < 81; i++) {
            initStrings[i] = (String) arrayOfCells[i].getValue();
        }

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/outputView.fxml"));
        Parent parent = loader.load();

        Scene scene = new Scene(parent);

        OutputController controller = loader.getController();

        controller.solveSudoku(initStrings);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();

    }


    public void actionClear(ActionEvent event) {

        for (ChoiceBox arrayOfCell : arrayOfCells) {

            arrayOfCell.setValue(numbers.get(0));

        }

    }




}
