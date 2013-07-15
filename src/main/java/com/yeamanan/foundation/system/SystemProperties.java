package com.yeamanan.foundation.system;

import java.util.Properties;
import org.apache.log4j.Logger;

/**
 * GetProperties Class.
 *
 * @author Yeam Anan (<yeamanan@gmail.com>)
 */
public class SystemProperties {

    /**
     * Logger variable.
     */
    private static final Logger LOGGER =
            Logger.getLogger(SystemProperties.class);

    /**
     * Main() method.
     *
     * @param args Arguments
     */
    public static void main(final String[] args) {
        final Properties properties = System.getProperties();
        for (String key : properties.stringPropertyNames()) {
            LOGGER.info(key + " = " + properties.getProperty(key));
        }
    }
}
