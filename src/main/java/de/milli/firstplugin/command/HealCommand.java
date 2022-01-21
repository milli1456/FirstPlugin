package de.milli.firstplugin.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            player.setHealth(20);
        }
        try {
            sender.sendMessage(args[1]);
        }catch (ArrayIndexOutOfBoundsException ignored){}

        return false;
    }
}
