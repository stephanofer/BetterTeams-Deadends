package com.songoda.ultimateclaims.api.events;

import com.songoda.ultimateclaims.claim.Claim;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

/**
 * Called when a player gets kicked out of a claim.
 */
public class ClaimPlayerKickEvent extends ClaimEvent implements Cancellable {

    public ClaimPlayerKickEvent(Claim claim, OfflinePlayer player) {
        super(claim);
    }

    public boolean isCancelled() {
        return false;
    }

    public void setCancelled(boolean cancel) {
    }

    public OfflinePlayer getPlayer() {
        return null;
    }

    @Override
    public HandlerList getHandlers() {
        return null;
    }
}
