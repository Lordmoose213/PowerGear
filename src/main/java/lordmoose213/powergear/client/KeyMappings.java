package lordmoose213.powergear.client;

import lordmoose213.powergear.PowerGear;
import com.mojang.blaze3d.platform.InputConstants;

import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.ClientRegistry;

//This is basically an initialization class but its only needed on the client so its here ig
public class KeyMappings {
	
	public static KeyMapping testKeyMap;
	
	public static void reg() {
		testKeyMap = registerKey("testkey", KeyMapping.CATEGORY_MISC, InputConstants.KEY_B);
	}
	
	private static KeyMapping registerKey(String name, String category, int keycode) {
		final var key = new KeyMapping("key." + PowerGear.MOD_ID + "." + name, keycode, category);
		ClientRegistry.registerKeyBinding(key);
		return key;
	}
}
