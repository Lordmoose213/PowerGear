package lordmoose213.powergear.reg;

import lordmoose213.powergear.PowerGear;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

public class PacketHandler {
	private PacketHandler() {
		
	}
	
	private static final String PROTOCOL_VERSION = "1";
		
	public static final SimpleChannel INSTANCE = NetworkRegistry.ChannelBuilder
				.named(new ResourceLocation(PowerGear.MOD_ID, "main"))
				.networkProtocolVersion(()-> PROTOCOL_VERSION)
				.clientAcceptedVersions(PROTOCOL_VERSION::equals)
				.serverAcceptedVersions(PROTOCOL_VERSION::equals)
				.simpleChannel();
	
	public static void reg() {
		int index = 0;
	}
	
}
