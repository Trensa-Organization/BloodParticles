package me.dragontos.bloodparticles;

import me.dragontos.bloodparticles.Commands.Commands;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class BloodParticles extends JavaPlugin {

    private static BloodParticles plugin;

    @Override
    public void onEnable() {
        setupcommand();
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("§7[§fTR§7] §a§lBloodParticles enabled! §f|§r §6Coded by DRAGONTOS §f| §6Version " + this.getDescription().getVersion());
        Bukkit.getConsoleSender().sendMessage("");
    }

    private void setupcommand(){
        new Commands(this);

    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage("§7[§fTR§7] §c§lBloodParticles disabled! §f|§r §6Coded by DRAGONTOS §f| §6Version " + this.getDescription().getVersion());
        Bukkit.getConsoleSender().sendMessage("");
    }
}
