package com.mainacad.helpers;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jetty.websocket.api.Session;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * Created by alexey on 9/30/17.
 */
public class UrlParser {
    public static String cleanUpURL(String currentUrl) {
        return StringUtils.substringBefore(currentUrl,";");
    }
}
