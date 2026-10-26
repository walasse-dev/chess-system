package domain.chess.pieces;

import domain.board.Board;
import domain.chess.ChessPiece;
import domain.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
