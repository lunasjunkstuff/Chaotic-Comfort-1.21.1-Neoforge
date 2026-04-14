package net.lunaastryx.chaotic_comfort.item;

import net.lunaastryx.chaotic_comfort.ChaoticComfort;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister .Items ITEMS = DeferredRegister.createItems(ChaoticComfort.MOD_ID);

    public static final DeferredItem<Item> GOLDEN_NETHER_STAR = ITEMS.register("golden_nether_star",
            () -> new Item(new Item.Properties().fireResistant()));

    public static final DeferredItem<AxeItem> ELECTRIC_GUITAR = ITEMS.register("electric_guitar",
            () -> new AxeItem(ModToolTiers.ELECTRIC_GUITAR, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.ELECTRIC_GUITAR, 0, -2.67f))){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.chaotic_comfort.electric_guitar.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<AxeItem> GLITCHY_ELECTRIC_GUITAR = ITEMS.register("glitchy_electric_guitar",
            () -> new AxeItem(ModToolTiers.ELECTRIC_GUITAR, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.ELECTRIC_GUITAR, 0, -2.67f))){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.chaotic_comfort.glitchy_electric_guitar.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
