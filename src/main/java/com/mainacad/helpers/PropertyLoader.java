package com.mainacad.helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

/**
 * Created by alexey on 9/9/17.
 */
public class PropertyLoader {

    public static String loadProperty(String propertyName) {
        Properties properties = new Properties();

        try {
            FileInputStream fileInputStream = new FileInputStream("src/main/java/resources/properties.xml");
            properties.loadFromXML(fileInputStream);

        } catch (FileNotFoundException e) {
            System.out.println("Please check path to properties file" + e);

        } catch (InvalidPropertiesFormatException e) {
            System.out.println("Please check property format" + e);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties.getProperty(propertyName);
    }
}
