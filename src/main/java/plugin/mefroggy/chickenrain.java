package plugin.mefroggy;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class chickenrain extends JavaPlugin {
    public static chickenrain plugin;

    @Override
    public void onEnable() {
        plugin = this;
        // Plugin startup logic
        ChickenSpawn.spawn = false;
        ChickenSpawn.start();
        getCommand("chickenrain").setExecutor(new ToggleCommand());

        Bukkit.getConsoleSender().sendMessage("-= ChickenRain =-");
        Bukkit.getConsoleSender().sendMessage("Version v1 has been Enabled");
        Bukkit.getConsoleSender().sendMessage("-= By meFroggy =-");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage("-= ChickenRain =-");
        Bukkit.getConsoleSender().sendMessage("Has been Disabled");
        Bukkit.getConsoleSender().sendMessage("-= By meFroggy =-");
    }
}
