package com.neosstuff.musicmod.item;

import com.neosstuff.musicmod.MusicMod;
import com.neosstuff.musicmod.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MusicMod.MOD_ID);

    public static final RegistryObject<Item> goodbyetoaworlddisk = ITEMS.register("goodbyetoaworlddisk",
            ()-> new Item(new Item.Properties().jukeboxPlayable(ModSounds.GOODBYETOAWORLD_KEY).stacksTo(1)));

    public static final RegistryObject<Item> shelterdisk = ITEMS.register("shelterdisk",
            ()-> new Item(new Item.Properties().jukeboxPlayable(ModSounds.SHELTER_KEY).stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
