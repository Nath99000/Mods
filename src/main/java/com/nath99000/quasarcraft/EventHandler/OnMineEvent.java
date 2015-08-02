package com.nath99000.quasarcraft.EventHandler;

import com.nath99000.quasarcraft.init.ModItems;
import com.nath99000.quasarcraft.quasarcraft;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.item.ItemStack;

public class OnMineEvent {

    @SubscribeEvent
    public void onMinedUranium(PlayerEvent.ItemPickupEvent e){
        if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(ModItems.Uranium))){
            e.player.addStat(quasarcraft.QCAUranium, 1);
        }
    }
}
