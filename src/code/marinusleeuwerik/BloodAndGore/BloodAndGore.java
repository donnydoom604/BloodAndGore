package code.marinusleeuwerik.BloodAndGore;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import code.marinusleeuwerik.BloodAndGore.ParticleEffect;

public class BloodAndGore extends JavaPlugin implements Listener {
	private static final Logger log = Logger.getLogger("Minecraft");
	public static BloodAndGore plugin;
	
	PluginDescriptionFile PluginDescFile = this.getDescription();
	@Override
	public void onDisable() {
		
	}
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
		this.saveDefaultConfig();
	}
	
	@EventHandler
	public void EntityDamageByEntity(EntityDamageByEntityEvent event){
		Entity victim = event.getEntity();
		EntityType victimType = event.getEntityType();
		if(victimType == EntityType.PLAYER) {
			Boolean playerEnabled = this.getConfig().getBoolean("player.enabled");
			if(playerEnabled == true) {
				int playerMaterial = this.getConfig().getInt("player.material");
				int playerAmount = this.getConfig().getInt("player.amount");
				Location playerLocation = victim.getLocation().add(0, 0, 0);
				
				ParticleEffect.displayTileCrack(playerLocation, 150, playerMaterial, (byte)0, 0F, 0F, 0F, playerAmount);
			}
		} else if(victimType == EntityType.CHICKEN) {
			Boolean chickenEnabled = this.getConfig().getBoolean("chicken.enabled");
			if(chickenEnabled == true) {
				int chickenMaterial = this.getConfig().getInt("chicken.material");
				int chickenAmount = this.getConfig().getInt("chicken.amount");
				Location chickenLocation = victim.getLocation().add(0, 0, 0);
				
				ParticleEffect.displayTileCrack(chickenLocation, 150, chickenMaterial, (byte)0, 0F, 0F, 0F, chickenAmount);
			}
		} else if(victimType == EntityType.COW) {
			Boolean cowEnabled = this.getConfig().getBoolean("cow.enabled");
			if(cowEnabled == true) {
				int cowMaterial = this.getConfig().getInt("cow.material");
				int cowAmount = this.getConfig().getInt("cow.amount");
				Location cowLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.OCELOT) {
			Boolean ocelotEnabled = this.getConfig().getBoolean("ocelot.enabled");
			if(ocelotEnabled == true) {
				int ocelotMaterial = this.getConfig().getInt("ocelot.material");
				int ocelotAmount = this.getConfig().getInt("ocelot.amount");
				Location ocelotLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.PIG) {
			Boolean pigEnabled = this.getConfig().getBoolean("pig.enabled");
			if(pigEnabled == true) {
				int pigMaterial = this.getConfig().getInt("pig.material");
				int pigAmount = this.getConfig().getInt("pig.amount");
				Location pigLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.SHEEP) {
			Boolean sheepEnabled = this.getConfig().getBoolean("sheep.enabled");
			if(sheepEnabled == true) {
				int sheepMaterial = this.getConfig().getInt("sheep.material");
				int sheepAmount = this.getConfig().getInt("sheep.amount");
				Location sheepLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.HORSE) {
			Boolean horseEnabled = this.getConfig().getBoolean("horse.enabled");
			if(horseEnabled == true) {
				int horseMaterial = this.getConfig().getInt("horse.material");
				int horseAmount = this.getConfig().getInt("horse.amount");
				Location horseLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.SQUID) {
			Boolean squidEnabled = this.getConfig().getBoolean("squid.enabled");
			if(squidEnabled == true) {
				int squidMaterial = this.getConfig().getInt("squid.material");
				int squidAmount = this.getConfig().getInt("squid.amount");
				Location squidLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.BAT) {
			Boolean batEnabled = this.getConfig().getBoolean("bat.enabled");
			if(batEnabled == true) {
				int batMaterial = this.getConfig().getInt("bat.material");
				int batAmount = this.getConfig().getInt("bat.amount");
				Location batLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.VILLAGER) {
			Boolean villagerEnabled = this.getConfig().getBoolean("villager.enabled");
			if(villagerEnabled == true) {
				int villagerMaterial = this.getConfig().getInt("villager.material");
				int villagerAmount = this.getConfig().getInt("villager.amount");
				Location villagerLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.MUSHROOM_COW) {
			Boolean mooshroomEnabled = this.getConfig().getBoolean("mooshroom.enabled");
			if(mooshroomEnabled == true) {
				int mooshroomMaterial = this.getConfig().getInt("mooshroom.material");
				int mooshroomAmount = this.getConfig().getInt("mooshroom.amount");
				Location mooshroomLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.CAVE_SPIDER) {
			Boolean cavespiderEnabled = this.getConfig().getBoolean("cavespider.enabled");
			if(cavespiderEnabled == true) {
				int cavespiderMaterial = this.getConfig().getInt("cavespider.material");
				int cavespiderAmount = this.getConfig().getInt("cavespider.amount");
				Location cavespiderLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.ENDERMAN) {
			Boolean endermanEnabled = this.getConfig().getBoolean("enderman.enabled");
			if(endermanEnabled == true) {
				int endermanMaterial = this.getConfig().getInt("enderman.material");
				int endermanAmount = this.getConfig().getInt("enderman.amount");
				Location endermanLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.SPIDER) {
			Boolean spiderEnabled = this.getConfig().getBoolean("spider.enabled");
			if(spiderEnabled == true) {
				int spiderMaterial = this.getConfig().getInt("spider.material");
				int spiderAmount = this.getConfig().getInt("spider.amount");
				Location spiderLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.WOLF) {
			Boolean wolfEnabled = this.getConfig().getBoolean("wolf.enabled");
			if(wolfEnabled == true) {
				int wolfMaterial = this.getConfig().getInt("wolf.material");
				int wolfAmount = this.getConfig().getInt("wolf.amount");
				Location wolfLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.PIG_ZOMBIE) {
			Boolean pigmanEnabled = this.getConfig().getBoolean("pigman.enabled");
			if(pigmanEnabled == true) {
				int pigmanMaterial = this.getConfig().getInt("pigman.material");
				int pigmanAmount = this.getConfig().getInt("pigman.amount");
				Location pigmanLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.BLAZE) {
			Boolean blazeEnabled = this.getConfig().getBoolean("blaze.enabled");
			if(blazeEnabled == true) {
				int blazeMaterial = this.getConfig().getInt("blaze.material");
				int blazeAmount = this.getConfig().getInt("blaze.amount");
				Location blazeLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.CREEPER) {
			Boolean creeperEnabled = this.getConfig().getBoolean("creeper.enabled");
			if(creeperEnabled == true) {
				int creeperMaterial = this.getConfig().getInt("creeper.material");
				int creeperAmount = this.getConfig().getInt("creeper.amount");
				Location creeperLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.GHAST) {
			Boolean ghastEnabled = this.getConfig().getBoolean("ghast.enabled");
			if(ghastEnabled == true) {
				int ghastMaterial = this.getConfig().getInt("ghast.material");
				int ghastAmount = this.getConfig().getInt("ghast.amount");
				Location ghastLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.SILVERFISH) {
			Boolean silverfishEnabled = this.getConfig().getBoolean("silverfish.enabled");
			if(silverfishEnabled == true) {
				int silverfishMaterial = this.getConfig().getInt("silverfish.material");
				int silverfishAmount = this.getConfig().getInt("silverfish.amount");
				Location silverfishLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.SKELETON) {
			Boolean skeletonEnabled = this.getConfig().getBoolean("skeleton.enabled");
			if(skeletonEnabled == true) {
				int skeletonMaterial = this.getConfig().getInt("skeleton.material");
				int skeletonAmount = this.getConfig().getInt("skeleton.amount");
				Location skeletonLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.WITCH) {
			Boolean witchEnabled = this.getConfig().getBoolean("witch.enabled");
			if(witchEnabled == true) {
				int witchMaterial = this.getConfig().getInt("witch.material");
				int witchAmount = this.getConfig().getInt("witch.amount");
				Location witchLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.ZOMBIE) {
			Boolean zombieEnabled = this.getConfig().getBoolean("zombie.enabled");
			if(zombieEnabled == true) {
				int zombieMaterial = this.getConfig().getInt("zombie.material");
				int zombieAmount = this.getConfig().getInt("zombie.amount");
				Location zombieLocation = victim.getLocation().add(0, 0, 0);
			}
		}
	} 
}