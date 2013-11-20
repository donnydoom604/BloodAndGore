package code.marinusleeuwerik.BloodAndGore;

import java.util.logging.Logger;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class BloodAndGore extends JavaPlugin implements Listener {
	private static final Logger log = Logger.getLogger("Minecraft");
	public static BloodAndGore plugin;
	
	PluginDescriptionFile PluginDescFile = plugin.getDescription();
	@Override
	public void onDisable() {
		log.info("[BoodAndGore] Version: " + PluginDescFile.getVersion() + " has been disabled!");
	}
	
	@Override
	public void onEnable() {
		log.info("[BoodAndGore] Version: " + PluginDescFile.getVersion() + " by MarinusLeeuwerik has been enabled!");
		getServer().getPluginManager().registerEvents(this, this);
		plugin.saveDefaultConfig();
	}
	
	@EventHandler
	public void EntityDamageByEntity(EntityDamageByEntityEvent event){
		Entity victim = event.getEntity();
		EntityType victimType = event.getEntityType();
		if(victimType == EntityType.PLAYER) {
			Boolean playerEnabled = plugin.getConfig().getBoolean("player.enabled");
			if(playerEnabled == true) {
				int playerMaterial = plugin.getConfig().getInt("player.material");
				int playerAmount = plugin.getConfig().getInt("player.amount");
				Location playerLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.CHICKEN) {
			Boolean chickenEnabled = plugin.getConfig().getBoolean("chicken.enabled");
			if(chickenEnabled == true) {
				int chickenMaterial = plugin.getConfig().getInt("chicken.material");
				int chickenAmount = plugin.getConfig().getInt("chicken.amount");
				Location chickenLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.COW) {
			Boolean cowEnabled = plugin.getConfig().getBoolean("cow.enabled");
			if(cowEnabled == true) {
				int cowMaterial = plugin.getConfig().getInt("cow.material");
				int cowAmount = plugin.getConfig().getInt("cow.amount");
				Location cowLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.OCELOT) {
			Boolean ocelotEnabled = plugin.getConfig().getBoolean("ocelot.enabled");
			if(ocelotEnabled == true) {
				int ocelotMaterial = plugin.getConfig().getInt("ocelot.material");
				int ocelotAmount = plugin.getConfig().getInt("ocelot.amount");
				Location ocelotLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.PIG) {
			Boolean pigEnabled = plugin.getConfig().getBoolean("pig.enabled");
			if(pigEnabled == true) {
				int pigMaterial = plugin.getConfig().getInt("pig.material");
				int pigAmount = plugin.getConfig().getInt("pig.amount");
				Location pigLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.SHEEP) {
			Boolean sheepEnabled = plugin.getConfig().getBoolean("sheep.enabled");
			if(sheepEnabled == true) {
				int sheepMaterial = plugin.getConfig().getInt("sheep.material");
				int sheepAmount = plugin.getConfig().getInt("sheep.amount");
				Location sheepLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.HORSE) {
			Boolean horseEnabled = plugin.getConfig().getBoolean("horse.enabled");
			if(horseEnabled == true) {
				int horseMaterial = plugin.getConfig().getInt("horse.material");
				int horseAmount = plugin.getConfig().getInt("horse.amount");
				Location horseLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.SQUID) {
			Boolean squidEnabled = plugin.getConfig().getBoolean("squid.enabled");
			if(squidEnabled == true) {
				int squidMaterial = plugin.getConfig().getInt("squid.material");
				int squidAmount = plugin.getConfig().getInt("squid.amount");
				Location squidLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.BAT) {
			Boolean batEnabled = plugin.getConfig().getBoolean("bat.enabled");
			if(batEnabled == true) {
				int batMaterial = plugin.getConfig().getInt("bat.material");
				int batAmount = plugin.getConfig().getInt("bat.amount");
				Location batLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.VILLAGER) {
			Boolean villagerEnabled = plugin.getConfig().getBoolean("villager.enabled");
			if(villagerEnabled == true) {
				int villagerMaterial = plugin.getConfig().getInt("villager.material");
				int villagerAmount = plugin.getConfig().getInt("villager.amount");
				Location villagerLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.MUSHROOM_COW) {
			Boolean mooshroomEnabled = plugin.getConfig().getBoolean("mooshroom.enabled");
			if(mooshroomEnabled == true) {
				int mooshroomMaterial = plugin.getConfig().getInt("mooshroom.material");
				int mooshroomAmount = plugin.getConfig().getInt("mooshroom.amount");
				Location mooshroomLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.CAVE_SPIDER) {
			Boolean cavespiderEnabled = plugin.getConfig().getBoolean("cavespider.enabled");
			if(cavespiderEnabled == true) {
				int cavespiderMaterial = plugin.getConfig().getInt("cavespider.material");
				int cavespiderAmount = plugin.getConfig().getInt("cavespider.amount");
				Location cavespiderLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.ENDERMAN) {
			Boolean endermanEnabled = plugin.getConfig().getBoolean("enderman.enabled");
			if(endermanEnabled == true) {
				int endermanMaterial = plugin.getConfig().getInt("enderman.material");
				int endermanAmount = plugin.getConfig().getInt("enderman.amount");
				Location endermanLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.SPIDER) {
			Boolean spiderEnabled = plugin.getConfig().getBoolean("spider.enabled");
			if(spiderEnabled == true) {
				int spiderMaterial = plugin.getConfig().getInt("spider.material");
				int spiderAmount = plugin.getConfig().getInt("spider.amount");
				Location spiderLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.WOLF) {
			Boolean wolfEnabled = plugin.getConfig().getBoolean("wolf.enabled");
			if(wolfEnabled == true) {
				int wolfMaterial = plugin.getConfig().getInt("wolf.material");
				int wolfAmount = plugin.getConfig().getInt("wolf.amount");
				Location wolfLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.PIG_ZOMBIE) {
			Boolean pigmanEnabled = plugin.getConfig().getBoolean("pigman.enabled");
			if(pigmanEnabled == true) {
				int pigmanMaterial = plugin.getConfig().getInt("pigman.material");
				int pigmanAmount = plugin.getConfig().getInt("pigman.amount");
				Location pigmanLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.BLAZE) {
			Boolean blazeEnabled = plugin.getConfig().getBoolean("blaze.enabled");
			if(blazeEnabled == true) {
				int blazeMaterial = plugin.getConfig().getInt("blaze.material");
				int blazeAmount = plugin.getConfig().getInt("blaze.amount");
				Location blazeLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.CREEPER) {
			Boolean creeperEnabled = plugin.getConfig().getBoolean("creeper.enabled");
			if(creeperEnabled == true) {
				int creeperMaterial = plugin.getConfig().getInt("creeper.material");
				int creeperAmount = plugin.getConfig().getInt("creeper.amount");
				Location creeperLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.GHAST) {
			Boolean ghastEnabled = plugin.getConfig().getBoolean("ghast.enabled");
			if(ghastEnabled == true) {
				int ghastMaterial = plugin.getConfig().getInt("ghast.material");
				int ghastAmount = plugin.getConfig().getInt("ghast.amount");
				Location ghastLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.SILVERFISH) {
			Boolean silverfishEnabled = plugin.getConfig().getBoolean("silverfish.enabled");
			if(silverfishEnabled == true) {
				int silverfishMaterial = plugin.getConfig().getInt("silverfish.material");
				int silverfishAmount = plugin.getConfig().getInt("silverfish.amount");
				Location silverfishLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.SKELETON) {
			Boolean skeletonEnabled = plugin.getConfig().getBoolean("skeleton.enabled");
			if(skeletonEnabled == true) {
				int skeletonMaterial = plugin.getConfig().getInt("skeleton.material");
				int skeletonAmount = plugin.getConfig().getInt("skeleton.amount");
				Location skeletonLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.WITCH) {
			Boolean witchEnabled = plugin.getConfig().getBoolean("witch.enabled");
			if(witchEnabled == true) {
				int witchMaterial = plugin.getConfig().getInt("witch.material");
				int witchAmount = plugin.getConfig().getInt("witch.amount");
				Location witchLocation = victim.getLocation().add(0, 0, 0);
			}
		} else if(victimType == EntityType.ZOMBIE) {
			Boolean zombieEnabled = plugin.getConfig().getBoolean("zombie.enabled");
			if(zombieEnabled == true) {
				int zombieMaterial = plugin.getConfig().getInt("zombie.material");
				int zombieAmount = plugin.getConfig().getInt("zombie.amount");
				Location zombieLocation = victim.getLocation().add(0, 0, 0);
			}
		}
	} 
}