package com.nath99000.quasarcraft.entity;

import com.nath99000.quasarcraft.entity.EntityVeritas;
import com.nath99000.quasarcraft.reference.Reference;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class ModEntity {

    public static void init() {
        registerEntity();
    }
    public static void registerEntity(){

        createEntity(EntityVeritas.class, "Veritas", 0xFFFFFF, 0xF20000);
        createEntity(EntityInterBall.class, "InterBall", 0x000000, 0xFFFFFF);
        createEntity(EntityInterArrow.class, "InterArrow", 0x000000, 0xFFFFFF);
    }



    public static void createEntity(Class entityclass, String entityName, int solidColor, int spotColor) {
        int randomId = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(entityclass, entityName, randomId);
        EntityRegistry.registerModEntity(entityclass, entityName, randomId, Reference.Id, 64, 1, true);
        EntityRegistry.addSpawn(entityclass, 2, 0, 1, EnumCreatureType.creature);

        createEgg(randomId, solidColor, spotColor);
    }
    private static void createEgg(int randomId, int solidColor, int spotColor) {
        EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
    }
}
