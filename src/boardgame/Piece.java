package boardgame;

public class Piece {

	//So this is not visible in chess layer
	//lets define it as protected (it's just a matrix position)
	protected Position position;
	
	//to define its position on the board
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	//only classes inside same packages and subclasses can acess
	protected Board getBoard() {
		return board;
	}

	
	
	
}
