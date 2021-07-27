
package net.mcreator.all.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.all.AllModElements;

@AllModElements.ModElement.Tag
public class EmeraldpicakceItem extends AllModElements.ModElement {
	@ObjectHolder("all:emeraldpicakce")
	public static final Item block = null;
	public EmeraldpicakceItem(AllModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 370;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.STICK, (int) (1)), new ItemStack(Items.STICK, (int) (1)),
						new ItemStack(Items.EMERALD, (int) (1)), new ItemStack(Items.EMERALD, (int) (1)), new ItemStack(Items.EMERALD, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS).isImmuneToFire()) {
		}.setRegistryName("emeraldpicakce"));
	}
}
