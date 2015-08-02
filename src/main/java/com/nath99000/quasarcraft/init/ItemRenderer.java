package com.nath99000.quasarcraft.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemRenderer implements IItemRenderer {


    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        switch (type)
        {
            case EQUIPPED:return true;
            default: return false;
        }
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
    {
        return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        switch (type){
            case EQUIPPED:
            {

            }
            default:
                break;
        }

    }
}
