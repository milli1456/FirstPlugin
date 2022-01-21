package de.milli.firstplugin.command;

import de.milli.firstplugin.FirstPlugin;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class KillAll implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(player.isOp()){

            }else {
                player.sendMessage("§4Keine Rechte");
            }
        }else{
        }
        return true;
    }

   /* public static void killEntitys(){
        for (Entity entity : FirstPlugin.getPlugin().getServer().getWorld("world").getEntities()) {

        }
    }

    */
}