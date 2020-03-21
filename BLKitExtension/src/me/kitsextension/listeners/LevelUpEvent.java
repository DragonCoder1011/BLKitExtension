package me.kitsextension.listeners;

import me.kitsextension.api.VaultAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class LevelUpEvent implements Listener {

    private String tankKitPermission = "essentials.kits.tank";
    private String medicKitPermission = "essentials.kits.medic";
    private String psychoKitPermission = "essentials.kits.psycho";
    private String ninjaKitPermission = "essentials.kits.ninja";
    private String lumberjackKitPermission = "essentials.kits.lumberjack";
    private String puppyKitPermission = "essentials.kits.puppy";
    private String vaultAmount = "playervaults.amount.";

    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        Player player = e.getPlayer();
        //Add
        //Kits
        VaultAPI.addPermission(player, tankKitPermission, 3, "&c&lCN &8&l> &7You have unlocked kit &eTank&7!");
        VaultAPI.addPermission(player, medicKitPermission, 10, "&c&lCN &8&l> &7You have unlocked kit &eMedic&7!");
        VaultAPI.addPermission(player, psychoKitPermission, 20, "&c&lCN &8&l> &7You have unlocked kit &ePsycho&7!");
        VaultAPI.addPermission(player, ninjaKitPermission, 35, "&c&lCN &8&l> &7You have unlocked kit &eNinja&7!");
        VaultAPI.addPermission(player, lumberjackKitPermission, 50, "&c&lCN &8&l> &7You have unlocked kit &eLumberjack&7!");
        VaultAPI.addPermission(player, puppyKitPermission, 100, "&c&lCN &8&l> &7You have unlocked kit &ePuppy&7!");
        //Vaults
        VaultAPI.addPermission(player, vaultAmount + "1", 10, "&c&lCN &8&l> &7You have unlocked a &ePlayer Vault&7!");
        VaultAPI.addPermission(player, vaultAmount + "2", 50, "&c&lCN &8&l> &7You have unlocked a &ePlayer Vault&7!");
        VaultAPI.addPermission(player, vaultAmount + "3", 150, "&c&lCN &8&l> &7You have unlocked a &ePlayer Vault&7!");
        VaultAPI.addPermission(player, vaultAmount + "4", 350, "&c&lCN &8&l> &7You have unlocked a &ePlayer Vault&7!");
        VaultAPI.addPermission(player, vaultAmount + "5", 500, "&c&lCN &8&l> &7You have unlocked a &ePlayer Vault&7!");
    }
}

   /*     //Remove
        VaultAPI.removePermissions(player, tankKitPermission, 3, "&c&lCN &8&l> &7You have lost access to kit &eTank&7!");
        VaultAPI.removePermissions(player, medicKitPermission, 10, "&c&lCN &8&l> &7You have lost access to kit &eMedic&7!");
        VaultAPI.removePermissions(player, psychoKitPermission, 20, "&c&lCN &8&l> &7You have lost access to kit &ePsycho&7!");
        VaultAPI.removePermissions(player, ninjaKitPermission, 35, "&c&lCN &8&l> &7You have lost access to kit &eNinja&7!");
        VaultAPI.removePermissions(player, lumberjackKitPermission, 50, "&c&lCN &8&l> &7You have lost access to kit &eLumberjack&7!");
        VaultAPI.removePermissions(player, puppyKitPermission, 100, "&c&lCN &8&l> &7You have lost access to kit &ePuppy&7!");
        //Vaults
        VaultAPI.removePermissions(player, vaultAmount + "1", 100, "&c&lCN &8&l> &7You have lost access to a &ePlayer Vault&7!");
        VaultAPI.removePermissions(player, vaultAmount + "2", 200, "&c&lCN &8&l> &7You have lost access to a &ePlayer Vault&7!");
        VaultAPI.removePermissions(player, vaultAmount + "3", 300, "&c&lCN &8&l> &7You have lost access to a &ePlayer Vault&7!");
        VaultAPI.removePermissions(player, vaultAmount + "4", 400, "&c&lCN &8&l> &7You have lost access to a &ePlayer Vault&7!");
        VaultAPI.removePermissions(player, vaultAmount + "5", 500, "&c&lCN &8&l> &7You have lost access to a &ePlayer Vault&7!");
    }
}
*/