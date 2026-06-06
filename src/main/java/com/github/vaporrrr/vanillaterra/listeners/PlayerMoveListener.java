package com.github.vaporrrr.vanillaterra.listeners;

import com.github.vaporrrr.vanillaterra.VanillaTerra;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMoveListener implements Listener {
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        if (!VanillaTerra.config().getBoolean("ShowHeightInActionBar", true)) {
            return;
        }
        Player player = event.getPlayer();
        int heightOffset = VanillaTerra.config().getInt("HeightOffset", 0);
        int height = (int) Math.floor(player.getLocation().getY()) - heightOffset;
        player.sendActionBar(Component.text(height + "m"));
    }
}