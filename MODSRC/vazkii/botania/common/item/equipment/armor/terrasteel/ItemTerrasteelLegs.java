/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 * 
 * File Created @ [Apr 14, 2014, 3:13:49 PM (GMT)]
 */
package vazkii.botania.common.item.equipment.armor.terrasteel;

import vazkii.botania.common.lib.LibItemNames;

public class ItemTerrasteelLegs extends ItemTerrasteelArmor {

	public ItemTerrasteelLegs() {
		super(2, LibItemNames.TERRASTEEL_LEGS);
	}

	@Override
	int getHealthBoost() {
		return 5;
	}

}
