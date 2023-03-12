package fr.maxlego08.zkoth.api;

import java.util.List;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public interface FactionListener extends Listener {
	String getFactionTag(Player paramPlayer);
	
	List<Player> getOnlinePlayer(Player paramPlayer);
}