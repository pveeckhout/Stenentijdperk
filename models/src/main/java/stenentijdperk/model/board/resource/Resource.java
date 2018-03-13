package stenentijdperk.model.board.resource;

import lombok.Getter;
import stenentijdperk.model.player.Player;

import java.util.HashMap;
import java.util.Map;

@Getter
public class Resource {

	private final int availableSpots;

	private final Map<Player, Integer> numPawnsPerPlayerMap = new HashMap<>();

	public Resource(int availableSpots) {
		this.availableSpots = availableSpots;
	}

}
