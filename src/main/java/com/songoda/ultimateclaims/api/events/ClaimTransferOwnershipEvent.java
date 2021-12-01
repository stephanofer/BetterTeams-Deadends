package com.songoda.ultimateclaims.api.events;

import com.songoda.ultimateclaims.claim.Claim;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

/**
 * Called when a claim's ownership is transferred.
 */
public class ClaimTransferOwnershipEvent extends ClaimEvent implements Cancellable {

    public ClaimTransferOwnershipEvent(Claim claim, OfflinePlayer oldOwner, OfflinePlayer newOwner) {
        super(claim);
    }

    public boolean isCancelled() {
        return false;
    }

    public void setCancelled(boolean cancel) {
    }

    public OfflinePlayer getNewOwner() {
        return null;
    }

    public OfflinePlayer getOldOwner() {
        return null;
    }

    @Override
    public HandlerList getHandlers() {
        return null;
    }

}