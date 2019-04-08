package userInterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import models.Cell;
import models.SudokuGrid;
import java.io.IOException;


public class OutputController {

    @FXML
    private TextField cellText00, cellText01, cellText02, cellText03, cellText04, cellText05, cellText06, cellText07, cellText08, cellText09, cellText10, cellText11, cellText12, cellText13, cellText14, cellText15, cellText16, cellText17, cellText18, cellText19, cellText20, cellText21, cellText22, cellText23, cellText24, cellText25, cellText26, cellText27, cellText28, cellText29, cellText30, cellText31, cellText32, cellText33, cellText34, cellText35, cellText36, cellText37, cellText38, cellText39, cellText40, cellText41, cellText42, cellText43, cellText44, cellText45, cellText46, cellText47, cellText48, cellText49, cellText50, cellText51, cellText52, cellText53, cellText54, cellText55, cellText56, cellText57, cellText58, cellText59, cellText60, cellText61, cellText62, cellText63, cellText64, cellText65, cellText66, cellText67, cellText68, cellText69, cellText70, cellText71, cellText72, cellText73, cellText74, cellText75, cellText76, cellText77, cellText78, cellText79, cellText80;

    @FXML
    private TextArea textAreaOutputView;

    @FXML
    private Button solveButtonOutputView, clearButtonOutputView, returnButtonOutputView;

    private String[] initStringsOutput = new String[81];






    void solveSudoku(String[] initStrings) {

        solveButtonOutputView.setDisable(true);
        clearButtonOutputView.setDisable(true);
        returnButtonOutputView.setDisable(true);

        TextField[] arrayOfTextFields;

        arrayOfTextFields = new TextField[]{cellText00, cellText01, cellText02, cellText03, cellText04, cellText05, cellText06, cellText07, cellText08, cellText09, cellText10, cellText11, cellText12, cellText13, cellText14, cellText15, cellText16, cellText17, cellText18, cellText19, cellText20, cellText21, cellText22, cellText23, cellText24, cellText25, cellText26, cellText27, cellText28, cellText29, cellText30, cellText31, cellText32, cellText33, cellText34, cellText35, cellText36, cellText37, cellText38, cellText39, cellText40, cellText41, cellText42, cellText43, cellText44, cellText45, cellText46, cellText47, cellText48, cellText49, cellText50, cellText51, cellText52, cellText53, cellText54, cellText55, cellText56, cellText57, cellText58, cellText59, cellText60, cellText61, cellText62, cellText63, cellText64, cellText65, cellText66, cellText67, cellText68, cellText69, cellText70, cellText71, cellText72, cellText73, cellText74, cellText75, cellText76, cellText77, cellText78, cellText79, cellText80};

        for (int i = 0; i < 81; i++) {
            this.initStringsOutput[i] = initStrings[i];
            arrayOfTextFields[i].setText(initStrings[i]);
        }

        SudokuGrid sudoku = setUpSudokuGrid(arrayOfTextFields);

        if (sudoku.initNumbersOk() && SudokuGrid.sudokuSolutionFound(sudoku, 0, arrayOfTextFields)) {

            textAreaOutputView.setText("A solution to the Sudoku has been found.");

        }
        else {

            textAreaOutputView.setText("No solution could be found.");

        }

        returnButtonOutputView.setDisable(false);

    }













    private SudokuGrid setUpSudokuGrid(TextField[] arrayOfTextFields) {

        SudokuGrid sudoku = new SudokuGrid();

        for (int i = 0; i < arrayOfTextFields.length; i++) {

            if (arrayOfTextFields[i].getText().equals("")) {

                sudoku.setCell(i, new Cell(i));

            }

            else {

                sudoku.setCell(i, new Cell(i, true, Integer.valueOf(initStringsOutput[i])));

            }

        }

        return sudoku;

    }





    public void actionReturn(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/inputView.fxml"));
        Parent parent = loader.load();

        Scene scene = new Scene(parent);

        InputController controller = loader.getController();

        controller.initArray(initStringsOutput);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();

    }




}
