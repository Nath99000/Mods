package com.nath99000.quasarcraft.EventHandler;

import com.nath99000.quasarcraft.init.ModItems;
import com.nath99000.quasarcraft.quasarcraft;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class OnCraftEvent {

    @SubscribeEvent
    public void onCraftedQuasar(PlayerEvent.ItemCraftedEvent e){
        if (e.crafting.getItem().equals(ModItems.Quasar)){
            e.player.addStat(quasarcraft.QCAQuasar, 1);
        }
    }

}
