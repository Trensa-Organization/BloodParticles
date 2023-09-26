package me.dragontos.bloodparticles;

import me.dragontos.bloodparticles.Commands.Commands;
import me.dragontos.bloodparticles.Event.BloodEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class BloodParticles extends JavaPlugin {

    private static BloodParticles plugin;

    @Override
    public void onEnable() {
        plugin = this;

        setupCommands();
        setupListeners();

        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("§7[§fTR§7] §a§lBloodParticles enabled! §f|§r §6Coded by DRAGONTOS §f| §6Version " + getDescription().getVersion());
        Bukkit.getConsoleSender().sendMessage("");
    }

    private void setupListeners() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new BloodEvent(this), this);
    }

    private void setupCommands() {
        new Commands(this);
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("§7[§fTR§7] §c§lBloodParticles disabled! §f|§r §6Coded by DRAGONTOS §f| §6Version " + getDescription().getVersion());
        Bukkit.getConsoleSender().sendMessage("");
    }
}