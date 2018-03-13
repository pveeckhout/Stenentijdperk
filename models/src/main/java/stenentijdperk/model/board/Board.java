package stenentijdperk.model.board;

import lombok.Getter;
import lombok.Setter;
import stenentijdperk.model.board.resource.Resource;
import stenentijdperk.model.core.UUIDEntity;
import stenentijdperk.model.player.Player;

@Getter
@Setter
public abstract class Board extends UUIDEntity {

	protected Resource hunting;
	protected Resource forrest;
	protected Resource clayPit;
	protected Resource quarry;
	protected Resource river;
	protected Resource toolMaker;

	private final Player[] players;

	public Board(Player... players) {
		if (players.length > 4 || players.length < 2) {
			throw new IllegalArgumentException("number of players must be 2, 3 or 4");
		}
		this.players = players;
	}
}
