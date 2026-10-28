package domain.chess;

import domain.board.BoardException;

import java.io.Serial;

public class ChessException extends BoardException {
    @Serial
    private static final long serialVersionUID = 1L;

    public ChessException(String message) {
        super(message);
    }
}
