package me.dragontos.bloodparticles.Commands;

import me.dragontos.bloodparticles.BloodParticles;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

    private BloodParticles pl;

    public Commands(BloodParticles pl)
    {
        this.pl = pl;
        pl.getCommand("BloodParticles").setExecutor(this);
        pl.getCommand("bp").setExecutor(this);
    }
    @Override
    public boolean onCommand(CommandSender sdr, Command cmd, String str, String[] args)
    {
        Player p = (Player) sdr;
        //Gets config String.
        String prefix = "§7[§9EXA§7]§r ";

    if(!(sdr instanceof Player))
    {
        sdr.sendMessage("Owo what you dowing?");
        return false;
    }

    if(args.length == 0)
    {
            p.sendMessage(Color(prefix)
                    + "§r/bp help for help");
            return false;
    }

    if(args[0].equalsIgnoreCase("info"))
        {
            p.sendMessage(Color(""));
            p.sendMessage(Color( "&8&m+-----------=*&c&lBloodParticles Info&8&m*=-----------+"));
            p.sendMessage(Color( "   "));
            p.sendMessage(Color( "&4BloodParticles"));
            p.sendMessage(Color( "&7Coded by DRAGONTOS"));
            p.sendMessage(Color( "  "));
            p.sendMessage(Color( "&8&m+-----------=* &9&l=+=*-==-*=+=&8&m *=-----------+"));
            p.sendMessage(Color( " "));
            return false;
        }
        if(args[0].equalsIgnoreCase("help"))
        {
            p.sendMessage(Color( ""));
            p.sendMessage(Color("&8&m+-----------=*&c&9Extramentals Help&8&m*=-----------+"));
            p.sendMessage(Color("   "));
            p.sendMessage(Color("&7/ec to open enderchest."));
            p.sendMessage(Color("   "));
            p.sendMessage(Color("&7/dc to get the Discord Link."));
            p.sendMessage(Color("  "));
            p.sendMessage(Color("&7/gm to switch gamemode"));
            p.sendMessage(Color("  "));
            p.sendMessage(Color("&7/heal to heal yourself"));
            p.sendMessage(Color("  "));
            p.sendMessage(Color("&7/feed to feed yourself"));
            p.sendMessage(Color("  "));
            p.sendMessage(Color("&7/points to get your mob points."));
            p.sendMessage(Color("  "));
            p.sendMessage(Color("&7/EXA Info to get Info about the plugin."));
            p.sendMessage(Color("  "));
            p.sendMessage(Color("&7/EXA help to get this Message."));
            p.sendMessage(Color("  "));
            p.sendMessage(Color( "&8&m+-----------=* &9&l=+=*-==-*=+=&8&m *=-----------+"));
            p.sendMessage(Color( ""));
            return false;
        }
        return false;
    }
    private String Color(String str)
    {
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}

