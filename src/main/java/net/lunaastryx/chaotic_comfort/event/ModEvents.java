package net.lunaastryx.chaotic_comfort.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.lunaastryx.chaotic_comfort.ChaoticComfort;
import net.lunaastryx.chaotic_comfort.item.ModItems;
import net.lunaastryx.chaotic_comfort.villager.ModVillagers;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;

import java.util.List;

@EventBusSubscriber(modid = ChaoticComfort.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
     if (event.getType() == ModVillagers.GUY.value()) {
         Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

         trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                 new ItemCost(Items.EMERALD, 3),
                 new ItemStack(Blocks.TERRACOTTA, 24), 5, 3, 0.67f));
         trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                 new ItemCost(Items.EMERALD, 3),
                 new ItemStack(Blocks.RED_TERRACOTTA, 24), 5, 3, 0.67f));
         trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                 new ItemCost(Items.EMERALD, 3),
                 new ItemStack(Blocks.GREEN_TERRACOTTA, 24), 5, 3, 0.67f));
         trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                 new ItemCost(Items.EMERALD, 3),
                 new ItemStack(Blocks.YELLOW_TERRACOTTA, 24), 5, 3, 0.67f));
         trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                 new ItemCost(Items.EMERALD, 3),
                 new ItemStack(Blocks.BLUE_TERRACOTTA, 24), 5, 3, 0.67f));
         trades.get(1).add((entity, randomSource) -> new MerchantOffer(
                 new ItemCost(Items.EMERALD, 3),
                 new ItemStack(Blocks.LIGHT_BLUE_TERRACOTTA, 24), 5, 3, 0.67f));

         trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                 new ItemCost(Items.EMERALD, 3),
                 new ItemStack(Blocks.BRICKS, 24), 6, 7, 0.67f));
         trades.get(2).add((entity, randomSource) -> new MerchantOffer(
                 new ItemCost(Items.EMERALD, 3),
                 new ItemStack(Blocks.TUFF, 24), 3, 7, 0.67f));

         trades.get(3).add((entity, randomSource) -> new MerchantOffer(
                 new ItemCost(Items.EMERALD, 3),
                 new ItemStack(Blocks.STONE_BRICKS, 24), 7, 7, 0.67f));
         trades.get(3).add((entity, randomSource) -> new MerchantOffer(
                 new ItemCost(Items.EMERALD, 3),
                 new ItemStack(Blocks.COBBLED_DEEPSLATE, 24), 5, 7, 0.67f));

         trades.get(4).add((entity, randomSource) -> new MerchantOffer(
                 new ItemCost(Items.DIAMOND, 2),
                 new ItemStack(ModItems.ELECTRIC_GUITAR.get(), 1), 1, 67, 0.67f));
     }
    }
}
