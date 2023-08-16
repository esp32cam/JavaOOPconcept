public class Array2Dshort {
    public static void main(String[] args) {
        int[][] array2D = new int[4][5];

        // Initialize the 2D array with values from 1 to 25
        int counter = 1;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = counter++;
            }
        }

        // Print all elements in the 2D array
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
