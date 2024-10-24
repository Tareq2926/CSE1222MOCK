package q2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(2, 3);
        matrix.set(2, 3, "Jubaear");
        matrix.set(1, 2, "Siam");

        System.out.println(matrix.get(1, 2));
        System.out.println(matrix.get(4, 2));

        ArrayList<Matrix.Cell> describedCells = matrix.getDescribedCells();
        System.out.println(describedCells);
    }
}