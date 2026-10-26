package domain.chess.pieces;

import domain.board.Board;
import domain.chess.ChessPiece;
import domain.chess.Color;

public class King extends ChessPiece {


    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
