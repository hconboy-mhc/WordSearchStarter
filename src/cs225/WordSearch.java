package cs225;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

class WordSearch {
    // The 2D array of characters containing the hidden words.
    private char[][] grid;

    /**
     * Reads a WordSearch grid from a file and initializes the grid.
     * The first line of the file contains a number.  That number 
     * indicates how many rows are in the grid.  Following that, 
     * there will be a line for each row of the grid.  The characters 
     * in the grid will be separated by spaces in the file.  
     * 
     * @param filename the name of the file containing the grid.
     */
    public WordSearch(String filename) {
        try {
            Scanner in = new Scanner (new File (filename));
            
            // Read in # of rows in the grid
            int numRows = in.nextInt();
            in.nextLine();
            
            // Read in the first row
            char[] firstRow = readRow(in);
            
            // Now that we know the number of rows and the number of 
            // characters in each row, we can create the grid.
            grid = new char[numRows][firstRow.length];
            grid[0]= firstRow;
            
            // Read in the rest of the grid.
            for (int i = 1; i < numRows; i++) {
                grid[i] = readRow(in);
            }
            in.close();
            
        } catch (InputMismatchException e) {
            System.out.println("The file should start with the number of rows.");
        } catch (FileNotFoundException e) {
            System.out.println ("WordSearch file " + filename + " was not found.");
        }
    }

    /**
     * Read one row from the file
     * @param in the scanner that is reading the file
     * @return a character array containing the letters in the row read.
     */
    private char[] readRow(Scanner in) {
        String gridLine = in.nextLine();
        String[] row = gridLine.split(" ");
        char[] charRow = new char[row.length];
        for (int i = 0; i < row.length; i++) {
            charRow[i] = row[i].charAt(0);
        }
        return charRow;
    }

    /**
     * Search for a word in the grid in all directions
     * 
     * @param nextWord the word to search for
     * @return an array with 3 values. The first value is the row where the
     *         first letter of the word appears. The second value is the column
     *         where the first letter in the word appears. The third value
     *         indicates the direction: 
     *         0 - left-to-right 
     *         1 - right-to-left 
     *         2 - top-to-bottom 
     *         3 - bottom-to-top 
     *         4 - diagonal-down-left-to-right 
     *         5 - diagonal-down-right-to-left 
     *         6 - diagonal-up-left-to-right 
     *         7 - diagonal-up-right-to-left 
     *         If the word cannot be found, the array that is returned should 
     *         contain 3 values that are all -1.
     */
    public int[] findWord(String nextWord) {
        // You need to write this.
        return new int[3];
    }
    
    /**
     * To be used only for testing purposes
     * @return the grid
     */
    protected char[][] getGrid() {
        return grid;
    }


}
