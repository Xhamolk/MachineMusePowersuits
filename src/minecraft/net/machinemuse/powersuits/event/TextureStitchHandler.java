package net.machinemuse.powersuits.event;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.machinemuse.utils.render.GlowBuffer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class TextureStitchHandler {
    @SideOnly(Side.CLIENT)
    @ForgeSubscribe
    public void renderLast(RenderWorldLastEvent event) {

        Minecraft mc = Minecraft.getMinecraft();
        ScaledResolution screen = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
        GlowBuffer.drawFullScreen(screen);
    }

    @ForgeSubscribe
    public void onTextureStitch(TextureStitchEvent.Post event) {
        // MuseIcon.registerAllIcons(event.map);
    }
}
