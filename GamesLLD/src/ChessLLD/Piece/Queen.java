package ChessLLD.Piece;

import ChessLLD.Block;
import ChessLLD.Board;

public class Queen extends Piece {
    @Override
    public boolean canMove(Board board, Block startBlock, Block endBlock) {
        return false;
    }
    public Queen(boolean white) {
        super(white);
    }
}