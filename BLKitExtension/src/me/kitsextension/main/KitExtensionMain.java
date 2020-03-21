package me.kitsextension.main;

import me.kitsextension.listeners.LevelUpEvent;
import net.milkbowl.vault.permission.Permission;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class KitExtensionMain extends JavaPlugin {

    public static Plugin plugin;
    public static Permission permission = null;

    public void onEnable(){
        plugin = this;
        setUpPermissions();
        Bukkit.getPluginManager().registerEvents(new LevelUpEvent(), this);
    }

    public void onDisable(){
        plugin = null;
    }

    private boolean setUpPermissions(){
        RegisteredServiceProvider<Permission> permProvider = Bukkit.getServer().getServicesManager().getRegistration(Permission.class);
        if(permProvider != null){
            permission = permProvider.getProvider();
        }

        return (permission != null);
    }
}
