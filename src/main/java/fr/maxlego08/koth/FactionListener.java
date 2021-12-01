package fr.maxlego08.koth;

import java.util.List;

import org.bukkit.entity.Player;

public interface FactionListener {
	public String getFactionTag(Player p);

	public String getFactionTag(String p);

	public List<Player> getOnlinePlayer(String p);

	public List<Player> getOnlinePlayer(Player p);
}
