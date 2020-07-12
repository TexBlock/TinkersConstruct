package slimeknights.tconstruct.tools;

import net.minecraft.item.Item;
import slimeknights.tconstruct.common.TinkerModule;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.modifiers.ICraftMod;
import slimeknights.tconstruct.library.modifiers.ModifierCrafting;
import slimeknights.tconstruct.library.registration.object.BlockItemObject;
import slimeknights.tconstruct.library.registration.object.ItemObject;
import slimeknights.tconstruct.shared.block.BeaconBaseBlock;
import slimeknights.tconstruct.shared.block.ConsecratedSoilBlock;
import slimeknights.tconstruct.shared.block.GraveyardSoilBlock;
import slimeknights.tconstruct.shared.block.SlimyMudBlock;

import java.util.ArrayList;

/**
 * Contains modifiers and the items or blocks used to craft modifiers
 */
@SuppressWarnings("unused")
public final class TinkerModifiers extends TinkerModule {
  /*
   * Blocks
   */
  // material
  public static final BlockItemObject<BeaconBaseBlock> silkyJewelBlock = BLOCKS.register("silky_jewel_block", () -> new BeaconBaseBlock(GENERIC_GEM_BLOCK), GENERAL_TOOLTIP_BLOCK_ITEM);
  // soil
  public static final BlockItemObject<GraveyardSoilBlock> graveyardSoil = BLOCKS.register("graveyard_soil", () -> new GraveyardSoilBlock(GENERIC_SAND_BLOCK), GENERAL_TOOLTIP_BLOCK_ITEM);
  public static final BlockItemObject<ConsecratedSoilBlock> consecratedSoil = BLOCKS.register("consecrated_soil", () -> new ConsecratedSoilBlock(GENERIC_SAND_BLOCK), GENERAL_TOOLTIP_BLOCK_ITEM);
  public static final BlockItemObject<SlimyMudBlock> slimyMudGreen = BLOCKS.register("slimy_mud_green", () -> new SlimyMudBlock(GENERIC_SAND_BLOCK, SlimyMudBlock.MudType.SLIMY_MUD_GREEN), GENERAL_TOOLTIP_BLOCK_ITEM);
  public static final BlockItemObject<SlimyMudBlock> slimyMudBlue = BLOCKS.register("slimy_mud_blue", () -> new SlimyMudBlock(GENERIC_SAND_BLOCK, SlimyMudBlock.MudType.SLIMY_MUD_BLUE), GENERAL_TOOLTIP_BLOCK_ITEM);
  public static final BlockItemObject<SlimyMudBlock> slimyMudMagma = BLOCKS.register("slimy_mud_magma", () -> new SlimyMudBlock(GENERIC_SAND_BLOCK, SlimyMudBlock.MudType.SLIMY_MUD_MAGMA), GENERAL_TOOLTIP_BLOCK_ITEM);

  /*
   * Items
   */
  public static final ItemObject<Item> greenSlimeCrystal = ITEMS.register("green_slime_crystal", GENERAL_PROPS);
  public static final ItemObject<Item> blueSlimeCrystal = ITEMS.register("blue_slime_crystal", GENERAL_PROPS);
  public static final ItemObject<Item> magmaSlimeCrystal = ITEMS.register("magma_slime_crystal", GENERAL_PROPS);
  public static final ItemObject<Item> widthExpander = ITEMS.register("width_expander", GENERAL_PROPS);
  public static final ItemObject<Item> heightExpander = ITEMS.register("height_expander", GENERAL_PROPS);
  public static final ItemObject<Item> reinforcement = ITEMS.register("reinforcement", GENERAL_PROPS);
  public static final ItemObject<Item> silkyCloth = ITEMS.register("silky_cloth", GENERAL_PROPS);
  public static final ItemObject<Item> silkyJewel = ITEMS.register("silky_jewel", GENERAL_PROPS);
  public static final ItemObject<Item> necroticBone = ITEMS.register("necrotic_bone", GENERAL_PROPS);
  public static final ItemObject<Item> moss = ITEMS.register("moss", GENERAL_PROPS);
  public static final ItemObject<Item> mendingMoss = ITEMS.register("mending_moss", GENERAL_PROPS);
  public static final ItemObject<Item> creativeModifier = ITEMS.register("creative_modifier", GENERAL_PROPS);

  /*
   * Modifier management
   */
  private static final ArrayList<ICraftMod> modifiers = new ArrayList<ICraftMod>(); //TODO: Find default size of ArrayList and
  //private static final ArrayList<IModBreakBlock> activeBreaks = new ArrayList<IModBreakBlock>();

  public static void registerCraftingModifier(ICraftMod mod)
  {
    modifiers.add(mod);
  }

  public static ArrayList<ICraftMod> getAllModifiers() {
    return modifiers;
  }

  public TinkerModifiers()
  {
    this.registerCraftingModifier(new ModifierCrafting());
  }
}
