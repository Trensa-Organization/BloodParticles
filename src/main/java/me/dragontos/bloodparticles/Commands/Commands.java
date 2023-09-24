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
        if (!(sdr instanceof Player)) {
            sdr.sendMessage("This command can only be run by players.");
            return false;
        }
        Player p = (Player) sdr;
        //Gets config String.
        String prefix = "§7[§cBP§7]§r ";

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
            p.sendMessage(Color("&8&m+-----------=*&c&9BloodParticles Help&8&m*=-----------+"));
            p.sendMessage(Color("   "));
            p.sendMessage(Color("&7/bp Info to get Info about the plugin."));
            p.sendMessage(Color("  "));
            p.sendMessage(Color("&7/bp help to get this Message."));
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

