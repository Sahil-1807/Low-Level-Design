package ChessLLD.Piece;

import ChessLLD.Block;
import ChessLLD.Board;

public class King extends Piece {
    public King(boolean white) {
        super(white);
    }
    public boolean canMove(Board board, Block startBlock, Block endBlock) {
        return false;
    }
}