package ChessLLD.Piece;

import ChessLLD.Block;
import ChessLLD.Board;

public class Knight extends Piece {
    public Knight(boolean white) {
        super(white);
    }
    public boolean canMove(Board board, Block startBlock, Block endBlock) {
        return false;
    }
}