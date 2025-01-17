package pepjebs.mapatlases.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;
import pepjebs.mapatlases.MapAtlasesMod;

@Config(name = MapAtlasesMod.MOD_ID)
public class MapAtlasesConfig implements ConfigData {

    @ConfigEntry.Gui.Tooltip()
    @Comment("The maximum number of Maps (Filled & Empty combined) allowed to be inside an Atlas.")
    public int maxMapCount = 128;

    @ConfigEntry.Gui.Tooltip()
    @Comment("Scale the mini-map to a given pixel size.")
    public int forceMiniMapScaling = 64;

    @ConfigEntry.Gui.Tooltip()
    @Comment("If 'true', the Mini-Map of the Active Map will be drawn on the HUD while the Atlas is on your hot-bar or off-hand.")
    public boolean drawMiniMapHUD = true;

    @ConfigEntry.Gui.Tooltip()
    @Comment("If 'true', Atlases will be able to store Empty Maps and auto-fill them as you explore.")
    public boolean enableEmptyMapEntryAndFill = true;

    @ConfigEntry.Gui.Tooltip()
    @Comment("Controls location where mini-map displays. Any of: 'HANDS', 'HOTBAR', or 'INVENTORY'.")
    public String activationLocation = "HOTBAR";

    @ConfigEntry.Gui.Tooltip()
    @Comment("Scale the world-map to a given pixel size.")
    public int forceWorldMapScaling = 128;

    @ConfigEntry.Gui.Tooltip()
    @Comment("Set to any of 'Upper'/'Lower' & 'Left'/'Right' to control anchor position of mini-map")
    public String miniMapAnchoring = "UpperRight";

    @ConfigEntry.Gui.Tooltip()
    @Comment("Enter an integer which will offset the mini-map horizontally")
    public int miniMapHorizontalOffset = 0;

    @ConfigEntry.Gui.Tooltip()
    @Comment("Enter an integer which will offset the mini-map vertically")
    public int miniMapVerticalOffset = 0;
}
