package com.stalemated.mixin.client;

import io.wispforest.accessories.client.gui.AccessoriesScreen;
import org.spongepowered.asm.mixin.Mixin;
import yalter.mousetweaks.api.MouseTweaksDisableWheelTweak;

@MouseTweaksDisableWheelTweak
@Mixin(value = AccessoriesScreen.class, priority = 1000)
public class AccessoriesScreenDisableMouseTweakMixin {

	// This mixin applies the @MouseTweaksDisableWheelTweak annotation to AccessoriesScreen
	// to prevent Mouse Tweaks from interfering with the scrollable areas of the Accessories UI.

}