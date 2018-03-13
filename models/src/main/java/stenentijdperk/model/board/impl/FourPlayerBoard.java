package stenentijdperk.model.board.impl;


import stenentijdperk.model.board.Board;
import stenentijdperk.model.board.resource.Resource;
import stenentijdperk.model.player.Player;

public class FourPlayerBoard extends Board {

	public FourPlayerBoard(Player... players) {
		super(players);
		hunting = new Resource(Integer.MAX_VALUE);
		forrest = new Resource(7);
		clayPit = new Resource(7);
		quarry = new Resource(7);
		river = new Resource(7);
		toolMaker = new Resource(1);
	}
}
