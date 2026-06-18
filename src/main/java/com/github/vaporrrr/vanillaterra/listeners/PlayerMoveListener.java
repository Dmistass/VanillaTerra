package com.github.vaporrrr.vanillaterra.listeners;

import com.github.vaporrrr.vanillaterra.VanillaTerra;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.configuration.ConfigurationSection;
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
        ConfigurationSection offsetSection = VanillaTerra.config().getConfigurationSection("Offset." + player.getWorld().getName());
        int worldOffset = 0;
        if (offsetSection != null) {
            worldOffset = offsetSection.getInt("y", 0);
        }
        int height = (int) Math.floor(player.getLocation().getY()) - worldOffset;
        player.sendActionBar(Component.text(height + "m"));
    }
}