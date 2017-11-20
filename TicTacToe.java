public class TicTacToe {
  private String[][] board;
  private int lastPlayer = 2; // 1 = x; 2 = o;

  public TicTacToe() {
    this.board = new String[3][3];
  }

  public String[][] getBoard() {
    return this.board;
  }

  public String[][] placeMarker(int row, int column) {
    String marker = (this.lastPlayer == 1) ? 'x' : 'o';
    if(validatePlacement(row, column)) {
      this.board[row][column] = marker;
    }
    return board;
  }

  private boolean validatePlacement(int row, int column) {
    // check if space is valid
    if(row < 3
    && row >= 0
    && column < 3
    && column >= 0) {
      // check if space is taken
      if(this.board[row][column] == null) {
        return true;
      }
    }
    return false;
  }
}
