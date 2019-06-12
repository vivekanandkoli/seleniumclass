package org.kale.rediff.sdk.testdataReaders;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Loads and read data from properties file
 */
public class PropertiesFileReader {	
    Properties prop = new Properties();

    /**
     * THis method load the default properties file
     */
    public void loadPropertiesFile() {
        InputStream input = null;
        try {
            input = new FileInputStream("config.properties");
            // load a properties file
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Obtain the value of given property
     *
     * @param property
     * @return
     */
    public String getPropertyValue(String property) {
        return prop.getProperty(property);
    }

    public void setPropertyValue(String property, String value) {
        prop.setProperty(property, value);
    }
}
