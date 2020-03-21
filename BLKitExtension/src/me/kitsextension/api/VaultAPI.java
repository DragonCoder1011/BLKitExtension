package me.kitsextension.api;

import me.kitsextension.main.KitExtensionMain;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class VaultAPI {

    private static boolean hasPermission(Player player, String permission) {
        return player.hasPermission(permission);
    }

    public static void addPermission(Player player, String permission, int level, String message) {
        if (hasPermission(player, permission) && BLAPI.getLevel(player) >= level) {
            return;
        }
        if (!hasPermission(player, permission) && BLAPI.getLevel(player) >= level) {
            KitExtensionMain.permission.playerAdd(player, permission);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
        }
    }
}