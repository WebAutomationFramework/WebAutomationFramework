package com.mainacad.helpers;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by alexey on 9/30/17.
 */
public class UrlParser {
    public static String cleanUpURL(String currentUrl) {
        return StringUtils.substringBefore(currentUrl,";");
    }
}
