package org.godotengine.godot.utils;
import android.view.MotionEvent;

public class InputUtils {
	/*
	 * Makes BUTTON_BACK and BUTTON_FORWARD mask to be equal to godot's BUTTON_MASK_XBUTTON
	 */
	public static int fixButtonsStateMask(int buttonMask) {
		return (buttonMask & ~(MotionEvent.BUTTON_BACK | MotionEvent.BUTTON_FORWARD)) | (((MotionEvent.BUTTON_BACK | MotionEvent.BUTTON_FORWARD) & buttonMask) << 4);
	}
}
