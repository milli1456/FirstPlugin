package de.milli.firstplugin.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class OnBlockBreakEvent implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        /*event.getPlayer().setHealthScale(event.getPlayer().getHealthScale() + 5);
        event.getPlayer().setHealth(event.getPlayer().getHealth() + 5);


         */
    }
}