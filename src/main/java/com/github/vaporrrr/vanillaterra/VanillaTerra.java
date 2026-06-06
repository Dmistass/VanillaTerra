package com.github.vaporrrr.vanillaterra;

import com.github.vaporrrr.vanillaterra.commands.Distortion;
import com.github.vaporrrr.vanillaterra.commands.Reload;
import com.github.vaporrrr.vanillaterra.commands.Tpll;
import com.github.vaporrrr.vanillaterra.commands.Where;
import com.github.vaporrrr.vanillaterra.listeners.PlayerMoveListener;
import net.kyori.adventure.text.Component;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class VanillaTerra extends JavaPlugin {
    @Override
    @SuppressWarnings("ConstantConditions")
    public void onEnable() {
        saveDefaultConfig();
        getLogger().info("VanillaTerra enabled!");
        getCommand("tpll").setExecutor(new Tpll());
        getCommand("where").setExecutor(new Where());
        getCommand("distortion").setExecutor(new Distortion());
        getCommand("vt-reload").setExecutor(new Reload());
        getServer().getPluginManager().registerEvents(new PlayerMoveListener(), this);
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    public static void sendComponent(CommandSender commandSender, Component component) {
        commandSender.sendMessage(component);
    }

    public static VanillaTerra getPlugin() {
        return getPlugin(VanillaTerra.class);
    }

    public static FileConfiguration config() {
        return getPlugin().getConfig();
    }
}