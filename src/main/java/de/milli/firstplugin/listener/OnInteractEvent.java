package de.milli.firstplugin.listener;

import net.md_5.bungee.api.chat.ClickEvent;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

public class OnInteractEvent implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event){
        if(event.getClickedBlock() != null ) {
            event.getClickedBlock().setType(Material.DIAMOND_BLOCK);
        }


    }
}
