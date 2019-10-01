package chess;

import boardgame.Boardexception;

public class ChessException extends Boardexception{
	private static final long serialVersionUID = 1L;
	
	public ChessException(String msg) {
		super(msg);
	}

}
