package github.ribagi;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.PluginManager;
//import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class LoginDeletion extends JavaPlugin implements Listener{
	@Override
	public void onEnable(){
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(this, this);
	}
	
	@Override
	public void onDisable(){
		
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e){
		getLogger().info("LoginDeletion PlayerJoin.");	
		e.getPlayer().getInventory().clear();
	}
	/*
	@EventHandler
	public void onPlayerLogon(PlayerLoginEvent e){
		getLogger().info("LoginDeletion PlayerLogin.");	
		e.getPlayer().getInventory().clear();
	}*/

}
