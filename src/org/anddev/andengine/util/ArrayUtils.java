package org.anddev.andengine.util;

/**
 * @author Nicolas Gramlich
 * @since 22:35:42 - 01.05.2011
 */
public class ArrayUtils {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================
	
	public static <T> T random(final T[] pArray) {
		return pArray[MathUtils.random(0, pArray.length - 1)];
	}

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
