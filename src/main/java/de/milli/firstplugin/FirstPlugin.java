package de.milli.firstplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new OnPlayerJoinEvent(),this);
        pm.registerEvents(new OnBlockBreakEvent(), this );
        pm.registerEvents(new OnInteractEvent(), this );
        getCommand("heal").setExecutor(new HealCommand());
        getLogger().info("§aDas plugin ist Aktiviert");
    }

    @Override
    public void onDisable() {
        getLogger().info("§4Das plugin ist nun Deaktiviert");
    }
}
