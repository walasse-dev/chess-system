package domain.board;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            throw new BoardException("Error creating board: Rows and columns must be greater than 1");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public Piece piece(int row, int column) {
        if (!positionExists(row, column)) {
            throw new BoardException("Error creating board: Position does not exist");
        }
        return pieces[row][column];
    }

    public Piece piece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Error creating board: Position does not exist");
        }
        return piece(position.getRow(), position.getColumn());
    }

    public void placePiece(Piece piece, Position position) {
        if (thereIsPiece(position)) {
            throw new BoardException(String.format("Error creating board: There is already a piece on position \"%d, %d\"", position.getRow(), position.getColumn()));
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    private boolean positionExists(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsPiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Error creating board: Position does not exist");
        }
        return piece(position) != null;
    }

    public Piece removePiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Error creating board: Position does not exist");
        }
        if (piece(position) == null) {
            return null;
        }
        Piece aux = piece(position);
        aux.position = null;
        pieces[position.getRow()][position.getColumn()] = null;
        return aux;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
}
