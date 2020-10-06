package bugexplorers.beelectricity.entities;

import bugexplorers.beelectricity.Beelectricity;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class BeelectricityItemGroups
{
    public static final ItemGroup GROUP_1 = FabricItemGroupBuilder.build(
        new Identifier(Beelectricity.ID, "general"),
        () -> new ItemStack(Blocks.COBBLESTONE));

    public static final ItemGroup GROUP_2 = FabricItemGroupBuilder.create(
            new Identifier(Beelectricity.ID, "other"))
            .icon(() -> new ItemStack(Items.BOWL))
            .build();
    // ...
}
