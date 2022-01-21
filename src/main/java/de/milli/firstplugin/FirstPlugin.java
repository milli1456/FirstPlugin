package de.milli.firstplugin;

import de.milli.firstplugin.command.KillAll;
import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new OnPlayerJoinEvent(),this);
        pm.registerEvents(new OnBlockBreakEvent(), this );
        pm.registerEvents(new OnInteractEvent(), this );
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("killall").setExecutor(new KillAll());
        getLogger().info("§aDas plugin ist Aktiviert");
    }

    @Override
    public void onDisable() {
        getLogger().info("§4Das plugin ist nun Deaktiviert");
    }
}
