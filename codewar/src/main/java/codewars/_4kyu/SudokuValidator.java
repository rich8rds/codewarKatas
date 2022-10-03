package codewars._4kyu;

import java.util.HashSet;
/**
 * SUDOKU VALIDATOR
 * Sudoku Background
 * Sudoku is a game played on a 9x9 grid. The goal of the game is to fill all cells of the grid
 * with digits from 1 to 9, so that each column, each row, and each of the nine 3x3 sub-grids
 * (also known as blocks) contain all of the digits from 1 to 9.
 * (More info at: http://en.wikipedia.org/wiki/Sudoku)
 *
 * Sudoku Solution Validator
 * Write a function validSolution/ValidateSolution/valid_solution() that accepts a
 * 2D array representing a Sudoku board, and returns true if it is a valid solution,
 * or false otherwise. The cells of the sudoku board may also contain 0's, which will
 * represent empty cells. Boards containing one or more zeroes are
 * considered to be invalid solutions.

 * The board is always 9 cells by 9 cells, and every cell only contains integers from 0 to 9.*/

public class SudokuValidator {
  public static boolean check(int[][] sudoku) {
      for(int i = 0 ; i < sudoku.length ; i++) {
        for(int j = 0 ; j < sudoku.length ; j++) {
          if(!checkValidity(sudoku, new int[] {i, j}, sudoku[i][j])) return false;
          if(sudoku[i][j] == 0) return false;
        }
      }
    return true;
  }

  private static boolean checkValidity(int[][] board, int[] pos, int num) {
    for(int i = 0 ; i < board.length ; i++)
      if(board[pos[0]][i] == num && pos[1] != i)
        return false;

    for(int j = 0 ; j < board.length ; j++)
      if(board[j][pos[1]] == num && pos[0] != j)
        return false;

    int xBox = pos[0] / 3;
    int yBox = pos[1] / 3;

     HashSet<Integer> set = new HashSet<>();
     for(int i = xBox * 3 ; i < xBox * 3 + 3 ; i++) {
       for(int j = yBox * 3 ; j < yBox * 3 + 3 ; j++) {
          if(set.contains(board[i][j]))return false;
          set.add(board[i][j]);
       }
     }
      return true;
   }
}
