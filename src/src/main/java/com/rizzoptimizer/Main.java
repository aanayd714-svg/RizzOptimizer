package com.rizzoptimizer;

import org.bukkit.plugin.java.JavaPlugin;
import com.rizzoptimizer.manager.LagManager;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        new LagManager(this).start();

        getCommand("optimize").setExecutor(new com.rizzoptimizer.command.OptimizeCommand(this));
    }
}
