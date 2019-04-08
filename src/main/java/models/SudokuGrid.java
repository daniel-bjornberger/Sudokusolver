package models;

import javafx.scene.control.TextField;

public class SudokuGrid {


    private Cell[] grid;



    public SudokuGrid() {

        this.grid = new Cell[81];

    }



    public Cell[] getGrid() {

        return grid;

    }



    public Cell getCell(int cellNumber) {

        return this.grid[cellNumber];

    }



    public void setCell(int n, Cell cell) {

        grid[n] = cell;

    }



    public boolean initNumbersOk() {

        boolean initNumbersOk = true;

        for (int x = 3; x <= 9 ; x += 3) {

            for (int y = 3; y <= 9 ; y += 3) {

                if (!subBlockNumbersUnique(x, y)) {

                    initNumbersOk = false;

                }

            }

        }

        int i = 1;

        while (initNumbersOk && i <= 9) {

            if (!rowNumbersUnique(i) || !columnNumbersUnique(i)) {

                initNumbersOk = false;

            }

            i++;

        }

        return initNumbersOk;

    }




    private boolean rowNumbersUnique(int y) {

        int[] cellValues = new int[9];

        for (int x = 1; x <= 9 ; x++) {

            cellValues[x - 1] = getCell(Cell.getCellNumberFromXAndYValues(x, y)).getCellValue();

        }

        return allNumbersUnique(cellValues);

    }



    private boolean columnNumbersUnique(int x) {

        int[] cellValues = new int[9];

        for (int y = 1; y <= 9 ; y++) {

            cellValues[y - 1] = getCell(Cell.getCellNumberFromXAndYValues(x, y)).getCellValue();

        }

        return allNumbersUnique(cellValues);

    }







    private boolean subBlockNumbersUnique(int x, int y) {

        int[] cellValues = new int[9];

        int arrayIndex = 0;

        int xMax = 3 * ( (x + 2) / 3 );

        int yMax = 3 * ( (y + 2) / 3 );

        for (int i = xMax - 2; i <= xMax; i++) {

            for (int j = yMax - 2; j <= yMax; j++) {

                cellValues[arrayIndex] = getCell(Cell.getCellNumberFromXAndYValues(i, j)).getCellValue();

                arrayIndex++;

            }

        }

        return allNumbersUnique(cellValues);

    }







    private boolean allNumbersUnique(int[] numbers) {

        boolean[] numberFound = new boolean[]{false, false, false, false, false, false, false, false, false, false};

        boolean numbersUnique = true;

        int i = 0;

        while (numbersUnique && i < numbers.length) {

            if (numbers[i] > 0) {

                if (numberFound[numbers[i]]) {

                    numbersUnique = false;

                }

                else {

                    numberFound[numbers[i]] = true;

                }

            }

            i++;

        }

        return numbersUnique;

    }



    public static boolean sudokuSolutionFound(SudokuGrid sudoku, int cellNumber, TextField[] arrayOfTextFields) {

        int i = 1;

        Cell cell = sudoku.getCell(cellNumber);

        boolean success = false;

        /*try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/


        if (cellNumber == 80 && cell.getCellValueIsSet()) {

            return true;

        }


        else if (cell.getCellValueIsSet()) {

            return sudokuSolutionFound(sudoku, cellNumber + 1, arrayOfTextFields);

        }


        else {

            while (!success && i <= 9) {

                cell.setCellValue(i);

                if (sudoku.subBlockNumbersUnique(cell.getxValue(), cell.getyValue()) && sudoku.rowNumbersUnique(cell.getyValue()) && sudoku.columnNumbersUnique(cell.getxValue())) {

                    arrayOfTextFields[cellNumber].setText(String.valueOf(i));

                    if (cellNumber == 80 || sudokuSolutionFound(sudoku, cellNumber + 1, arrayOfTextFields)) {

                        success = true;

                    }

                    //cell.setCellValueIsSet(true);

                }

                i++;

            }

            if (success) {

                return true;

            }

            else {

                cell.setCellValue(0);

                arrayOfTextFields[cellNumber].setText("");

                return false;

            }

        }

    }







}
