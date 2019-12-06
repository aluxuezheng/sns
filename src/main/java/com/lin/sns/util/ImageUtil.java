package com.lin.sns.util;

import java.util.HashMap;
import java.util.Map;

public class ImageUtil {

    private final static Map<String, String> IMAGE_SIZE = new HashMap<String, String>() {{
        put("120x120", "a-1-120x120");
        put("240x240", "a-1-240x240");
        put("280x210", "a-1-280x210");
        put("240x", "a-3-240x");
        put("480x", "a-3-480x");
        put("800x", "a-3-800x");
        put("960x", "a-3-960x");
        put("1600x", "a-3-1600x");
        put("x480", "a-4-x480");
        put(MAGIC_GIF_THUMB_FORMAT, "a-4-x640");
    }};

    private final static String MAGIC_GIF_THUMB_FORMAT = "x640";

    public static String getMagicImage(String source, String size, String format) {

        if (source.isEmpty() || source == null) {
            return "";
        }

        if ("original".equals(size)) {
            return source;
        }

        String suffix = IMAGE_SIZE.get(size) + "." + format;
        return source + "!" + suffix;
    }

    public static String getMagicImage(String source, String size) {
        return getMagicImage(source, size, "jpg");
    }
}
