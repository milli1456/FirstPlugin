package de.milli.firstplugin.command;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class KillAll implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(player.isOp()){
                killEntity(player.getWorld());
            }else {
                player.sendMessage("§4Keine Rechte");
            }
        }
        return true;
    }

   public static void killEntity(World world){
        for (Entity entity : world.getEntities()) {
            entity.remove();
        }
    }
}