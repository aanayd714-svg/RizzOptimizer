package com.rizzoptimizer;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("RizzOptimizer Enabled 🔥");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("RizzOptimizer Disabled ❌");
    }
}
