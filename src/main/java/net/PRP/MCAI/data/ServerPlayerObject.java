package net.PRP.MCAI.data;

import com.github.steveice10.mc.auth.data.GameProfile;
import com.github.steveice10.mc.protocol.data.game.PlayerListEntry;
import com.github.steveice10.mc.protocol.data.game.entity.player.GameMode;

import net.kyori.adventure.text.Component;

public class ServerPlayerObject {
	
	Component displayName;
	GameMode gamemode;
	int ping;
	GameProfile profile;
	
	public ServerPlayerObject(PlayerListEntry entry) {
		this.displayName = entry.getDisplayName();
		this.gamemode = entry.getGameMode();
		this.ping = entry.getPing();
		this.profile = entry.getProfile();
	}
}