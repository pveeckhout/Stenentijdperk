package stenentijdperk.model.board;

import stenentijdperk.model.board.impl.FourPlayerBoard;
import stenentijdperk.model.player.Player;

public interface BoardFactory {

	static Board createNewBoard(Player... players) {
		switch(players.length) {
			case 2: return new FourPlayerBoard(players);
			case 3: return new FourPlayerBoard(players);
			case 4: return new FourPlayerBoard(players);
			default: throw new IllegalArgumentException("number of players must be 2, 3 or 4");
		}
	}
}
