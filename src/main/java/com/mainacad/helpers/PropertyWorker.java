package com.mainacad.helpers;

/**
 * Created by alexey on 9/9/17.
 */
public class PropertyWorker {

    public static String getProperty() {
        String browserTypeProperty = System.getProperty("browser");

        if (browserTypeProperty != null) {
            return browserTypeProperty;
        }else
            return "chrome";
    }
}
