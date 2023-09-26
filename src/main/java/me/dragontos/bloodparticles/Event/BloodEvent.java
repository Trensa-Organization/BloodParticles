package me.dragontos.bloodparticles.Event;

import me.dragontos.bloodparticles.BloodParticles;
import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.block.data.type.TNT;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import java.util.HashMap;

public class BloodEvent implements Listener {
    static BloodParticles pl;

    public BloodEvent(BloodParticles i) {
        pl = i;
    }

    @EventHandler
    public void bloodpr(EntityDamageByEntityEvent e) {
        // Magma
            if (e.getEntity() instanceof Blaze) {
            e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0, 1.0, 0.0), Effect.STEP_SOUND, Material.MAGMA_BLOCK);
        return;
        }
        // Magma low
            if (e.getEntity() instanceof MagmaCube) {
            e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0, 0.2, 0.0), Effect.STEP_SOUND, Material.MAGMA_BLOCK);
        return;
        }
        // Portal
            if (e.getEntity() instanceof Enderman) {
            e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0, 1.0, 0.0), Effect.STEP_SOUND, Material.NETHER_PORTAL);
        return;
        }
        // Portal low
            if (e.getEntity() instanceof Endermite) {
            e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0, 0.2, 0.0), Effect.STEP_SOUND, Material.NETHER_PORTAL);
        return;
        }
        // Real blood
            if (e.getEntity() instanceof Squid || e.getEntity() instanceof ZombieHorse || e.getEntity() instanceof Drowned || e.getEntity() instanceof ZombieVillager || e.getEntity() instanceof PigZombie || e.getEntity() instanceof Piglin || e.getEntity() instanceof PiglinBrute || e.getEntity() instanceof Zombie || e.getEntity() instanceof Player || e.getEntity() instanceof Cow || e.getEntity() instanceof Horse || e.getEntity() instanceof Villager || e.getEntity() instanceof Witch   ) {
            e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0, 1.0, 0.0), Effect.STEP_SOUND, Material.NETHER_WART_BLOCK);
        return;
        }
        // Real blood low
            if (e.getEntity() instanceof Bat || e.getEntity() instanceof Chicken || e.getEntity() instanceof Ocelot || e.getEntity() instanceof Cow || e.getEntity() instanceof Sheep || e.getEntity() instanceof Pig || e.getEntity() instanceof Wolf || e.getEntity() instanceof Rabbit || e.getEntity() instanceof Guardian   ) {
            e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0, 0.2, 0.0), Effect.STEP_SOUND, Material.NETHER_WART_BLOCK);
        return;
        }

        if (e.getEntity() instanceof Spider || e.getEntity() instanceof CaveSpider || e.getEntity() instanceof Guardian   ) {
            e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0, 0.2, 0.0), Effect.STEP_SOUND, Material.COBWEB);
            return;
        }
        if (e.getEntity() instanceof Slime || e.getEntity() instanceof Silverfish || e.getEntity() instanceof Guardian   ) {
            e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0, 0.2, 0.0), Effect.STEP_SOUND, Material.SLIME_BLOCK);
            return;
        }

            if (e.getEntity() instanceof IronGolem) {
            e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0, 1.0, 0.0), Effect.STEP_SOUND, Material.IRON_BLOCK);
        return;
        }


            if (e.getEntity() instanceof Creeper) {
            e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0, 1.0, 0.0), Effect.STEP_SOUND, Material.TNT);
        return;
        }

            if (e.getEntity() instanceof Ghast) {
            e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0, 1.0, 0.0), Effect.STEP_SOUND, Material.QUARTZ_BLOCK);
        return;
        }

            if (e.getEntity() instanceof Skeleton || e.getEntity() instanceof SkeletonHorse || e.getEntity() instanceof WitherSkeleton || e.getEntity() instanceof Stray) {
            e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0, 1.0, 0.0), Effect.STEP_SOUND, Material.BONE_BLOCK);
        return;
        }
    }
}