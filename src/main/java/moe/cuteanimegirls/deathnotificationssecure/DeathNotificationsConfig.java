package moe.cuteanimegirls.deathnotificationssecure;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("deathnotificationssecure")
public interface DeathNotificationsConfig extends Config
{
	@ConfigItem(
			keyName = "relay",
			name = "Relay URL",
			description = "Relay URL to send messages to",
			position = 0
	)
	String relay();
	@ConfigItem(
			keyName = "token",
			name = "Token",
			description = "Token used to authorize within the relay server",
			position = 1
	)
	String token();
	@ConfigItem(
			keyName = "deathMessage",
			name = "Death message",
			description = "The message that will be included with the screenshot",
			position = 2
	)
	default String deathMessage() {
		return "died lmfao.";
	}
	@ConfigItem(
			keyName = "includeName",
			name = "Include player name",
			description = "Include player name at the start of the death notification message",
			position = 3
	)
	default boolean includeName()
	{
		return true;
	}
}
