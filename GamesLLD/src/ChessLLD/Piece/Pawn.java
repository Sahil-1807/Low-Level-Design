package ChessLLD.Piece;

import ChessLLD.Block;
import ChessLLD.Board;

public class Pawn extends Piece {
    public Pawn(boolean white) {
        super(white);
    }
    public boolean canMove(Board board, Block startBlock, Block endBlock) {
        return false;
    }
}