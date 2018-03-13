package stenentijdperk.model.board.resource;

import stenentijdperk.model.player.Player;

import java.util.Map;

public abstract class ResourcePawnPlacingMethod {

	public abstract void placePawns(Map<Player, Integer> numPawnsPerPlayerMap, Player player, int amount);
}
