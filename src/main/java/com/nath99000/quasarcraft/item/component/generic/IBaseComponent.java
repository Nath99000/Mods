package com.nath99000.quasarcraft.item.component.generic;

import net.minecraft.item.ItemStack;
//IBaseComponent is a piece of code adapted from clockwork phase mod, by lumaceon.
public interface IBaseComponent
{
    /**
     * This marks this component as a speed enhancement item. Returning false
     * will cause the crafting recipes to ignore speed.
     *
     * @return The density of mobs on the planet.
     */
    public boolean isPlanetMob(ItemStack is);

    /**
     * This marks this component as a quality enhancement item. Returning false
     * will cause the crafting recipes to ignore quality.
     *
     * @return The richness of veins on the planet.
     */
    public boolean isPlanetResource(ItemStack is);

    /**
     *
     * A general guide to resource quality with added elements:
     * 0 - nothing added
     * 0 - monolith
     * 0 - crop circles
     * 10 - mobs
     * 20 - moderate atmosphere
     * 30 - plant life
     * 40 - additional moon
     * 50 - water
     * 60 - carbon deposits
     * 70 - dense atmosphere
     * 80 - heated planetary core
     * 90 - natural mining-plants
     * 95 - large mineral deposits
     *
     * @return The quality of the gear. This is dependant on the item using it.
     */
    public int getPlanetMob(ItemStack is);

    /**
     * Gear speed, along with quality, is used different ways depending on the item.
     * Typically, a higher gear speed will exhaust the mainspring's tension at a
     * faster rate, but will offset this with a higher power.
     *
     * A general guide to mob drop quality with common metals:
     * 0 - nothing added
     * 0 - large mineral deposits
     * 0 - natural mining-plants
     * 10 - dense atmosphere
     * 20 - carbon deposits
     * 30 - heated planetary core
     * 40 - moderate atmosphere
     * 50 - additional moon
     * 60 - water
     * 70 - plant life
     * 80 - mobs selection
     * 90 - artificial conditioning-villages
     * 95 - monolith
     *
     * @return The speed of the gear. This is dependant on the item using it.
     */
    public int getPlanetResource(ItemStack is);

}