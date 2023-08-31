package com.songoda.ultimateclaims.api.events;

import com.songoda.ultimateclaims.claim.Claim;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

/**
 * Called when a player is banned from a claim.
 */
public class ClaimPlayerBanEvent extends ClaimEvent implements Cancellable {


    public ClaimPlayerBanEvent(Claim claim, Player executor, OfflinePlayer bannedPlayer) {
        super(claim);
    }

    public boolean isCancelled() {
        return false;
    }

    public void setCancelled(boolean cancel) {
    }

    public OfflinePlayer getBannedPlayer() {
        return null;
    }

    public Player getExecutor() {
        return null;
    }

    @Override
    public HandlerList getHandlers() {
        return null;
    }

}
