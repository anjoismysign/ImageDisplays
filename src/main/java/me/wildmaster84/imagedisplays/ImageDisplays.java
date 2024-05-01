package me.wildmaster84.imagedisplays;

import me.wildmaster84.imagedisplays.entities.projector.MoviePlayer;
import me.wildmaster84.imagedisplays.entities.TextPlayer;
import org.bukkit.Bukkit;
import org.bukkit.Location;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class ImageDisplays extends JavaPlugin {
	MoviePlayer moviePlayer;
	TextPlayer textPlayer;
	public static ImageDisplays instance;
	
	@Override
	public void onEnable() {
		instance = this;
        Location loc = new Location(Bukkit.getWorld("world"), -1, 109, 39);
        //moviePlayer = new MoviePlayer(loc);
        //moviePlayer.display(new File(this.getDataFolder(), "image.png"));
        textPlayer = new TextPlayer(loc);
        textPlayer.display(new File(this.getDataFolder(), "image.png"), 64, 64);
	}
	
	@Override
	public void onDisable() {
		//moviePlayer.clear();
		//textPlayer.clear();
	}

}
