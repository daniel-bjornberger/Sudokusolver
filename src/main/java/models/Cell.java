package models;

public class Cell {


    private int cellNumber;
    private int xValue;
    private int yValue;
    private Boolean cellValueIsSet;
    private int cellValue;


    public Cell(int cellNumber, Boolean cellValueIsSet, int cellValue) {

        this.cellNumber = cellNumber;
        this.xValue = cellNumber % 9 + 1;
        this.yValue = cellNumber / 9 + 1;
        this.cellValueIsSet = cellValueIsSet;
        this.cellValue = cellValue;

    }


    public Cell(int cellNumber) {

        this(cellNumber, false, 0);

    }


    public int getCellNumber() {
        return cellNumber;
    }

    public int getxValue() {
        return xValue;
    }

    public int getyValue() {
        return yValue;
    }

    public Boolean getCellValueIsSet() {
        return cellValueIsSet;
    }

    public int getCellValue() {
        return cellValue;
    }


    public void setCellValueIsSet(Boolean cellValueIsSet) {
        this.cellValueIsSet = cellValueIsSet;
    }

    public void setCellValue(int cellValue) {
        this.cellValue = cellValue;
    }


    public static int getCellNumberFromXAndYValues (int x, int y) {

        return 9 * y + x - 10;

    }


}
