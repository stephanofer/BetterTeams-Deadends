package com.songoda.ultimateclaims.api.events;

import com.songoda.ultimateclaims.claim.Claim;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

/**
 * Called when a claim is created.
 */
public class ClaimCreateEvent extends ClaimEvent implements Cancellable {


    public ClaimCreateEvent(Claim claim) {
        super(claim);
    }

    public boolean isCancelled() {
        return false;
    }

    public void setCancelled(boolean cancel) {
    }

    @Override
    public HandlerList getHandlers() {
        return null;
    }

}
