package com.neosstuff.musicmod.sound;

import com.neosstuff.musicmod.MusicMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.sounds.Music;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MusicMod.MOD_ID);

    public static final RegistryObject<SoundEvent> GOODBYETOAWORLD = registerSoundEvent("goodbyetoaworld");
    public static final ResourceKey<JukeboxSong> GOODBYETOAWORLD_KEY = ResourceKey.create(Registries.JUKEBOX_SONG,
            ResourceLocation.fromNamespaceAndPath(MusicMod.MOD_ID, "goodbyetoaworld"));

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(MusicMod.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}

