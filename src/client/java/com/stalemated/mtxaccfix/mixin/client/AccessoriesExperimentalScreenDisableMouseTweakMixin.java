package com.stalemated.mtxaccfix.mixin.client;

import io.wispforest.accessories.client.gui.AccessoriesExperimentalScreen;
import org.spongepowered.asm.mixin.Mixin;
import yalter.mousetweaks.api.MouseTweaksDisableWheelTweak;

@MouseTweaksDisableWheelTweak
@Mixin(value = AccessoriesExperimentalScreen.class, remap = false)
public class AccessoriesExperimentalScreenDisableMouseTweakMixin {

    // This mixin conditionally applies the @MouseTweaksDisableWheelTweak annotation
    // to AccessoriesExperimentalScreen to prevent Mouse Tweaks
    // from interfering with the scrollable areas of the Experimental Accessories UI.

}
