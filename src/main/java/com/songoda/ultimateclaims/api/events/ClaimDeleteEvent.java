package com.songoda.ultimateclaims.api.events;

import com.songoda.ultimateclaims.claim.Claim;
import com.songoda.ultimateclaims.claim.ClaimDeleteReason;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

/**
 * Called when a claim is deleted.
 */
public class ClaimDeleteEvent extends ClaimEvent implements Cancellable {

    public ClaimDeleteEvent(Claim claim, ClaimDeleteReason deleteReason) {
        super(claim);
    }

    public boolean isCancelled() {
        return false;
    }

    public void setCancelled(boolean cancel) {
    }

    public ClaimDeleteReason getDeleteReason() {
        return null;
    }

    @Override
    public HandlerList getHandlers() {
        return null;
    }


}