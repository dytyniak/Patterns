package Flyweight_good_approach;

import java.util.HashMap;
import java.util.Map;

class UnitImagesFactory {

	public static Map<Class<? extends Unit>, byte[]> images = new HashMap<>();

	public static byte[] createImage(Class<? extends Unit> c) {
		
		if (!images.containsKey(c)) {
			images.put(c, new byte[100000000]);
		}
		return images.get(c);
	}
}