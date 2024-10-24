package q2;

import javax.swing.*;
import java.util.ArrayList;

public class Matrix {
    private int numRows, numColumns;
    private String[][] grid;
    private ArrayList<Cell> describedCells = new ArrayList<Cell>();

    public Matrix(int numRows, int numColumns) {
        this.numRows = numRows;
        this.numColumns = numColumns;
        grid = new String[numRows][numColumns];
    }

    public String get(int row, int column){
        try{
            return grid[--row][--column];
        }catch (Exception e){
            return "Exception: " + e;
        }
    }

    public void set(int row, int column, String description){
        try{
            describedCells.add(new Cell(row, column));
            grid[--row][--column] = description;

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    public ArrayList<Cell> getDescribedCells(){
        return describedCells;
    }

    public class Cell{
        private int row, column;

        public Cell(int row, int column) {
            this.row = row;
            this.column = column;
        }

        @Override
        public String toString() {
            return "Cell: " +
                    "row = " + row +
                    " column=" + column + "\n";
        }
    }
}