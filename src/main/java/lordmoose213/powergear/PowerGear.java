package lordmoose213.powergear;

import com.mojang.logging.LogUtils;
import lordmoose213.powergear.reg.BlockReg;
import lordmoose213.powergear.reg.EntityReg;
import lordmoose213.powergear.reg.ItemReg;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("powergear")
public class PowerGear {

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    //Declares mod ID as a variable
    public static final String MOD_ID = "powergear";

    //Makes Creative mode tab
    public static final CreativeModeTab TAB_1 = new CreativeModeTab(MOD_ID + "!") {

        @Override
        public ItemStack makeIcon() {
            // TODO Auto-generated method stub
            return new ItemStack(ItemReg.ITEM_1.get());
        }
    };


    public PowerGear() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockReg.BLOCKS.register(bus);
        ItemReg.ITEMS.register(bus);
        EntityReg.ENTITIES.register(bus);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // Some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    /*private void enqueueIMC(final InterModEnqueueEvent event) {
        // Some example code to dispatch IMC to another mod
        InterModComms.sendTo("powergear", "helloworld", () -> {
            LOGGER.info("Hello world from the MDK");
            return "Hello world";
        });
    }*/

    private void processIMC(final InterModProcessEvent event) {
        // Some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m -> m.messageSupplier().get()).
                collect(Collectors.toList()));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("Hi from PowerGear!!");
    }

}
