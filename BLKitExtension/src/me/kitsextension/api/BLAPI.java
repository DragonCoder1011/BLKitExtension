package me.kitsextension.api;

import me.robin.battlelevels.api.BattleLevelsAPI;
import org.bukkit.entity.Player;

public class BLAPI {

    public static int getLevel(Player player){
        return BattleLevelsAPI.findPlayer(player.getUniqueId()).getLevel();
    }
}
